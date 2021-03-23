/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choise;

import java.util.Arrays;

/**
 *
 * @author Sinisa
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Welcome to Duke Choise Shop");
        System.out.println("Minimum price is " + Clothing.MIN_PRICE);
        System.out.println("Tax rate is " + Clothing.TAX_RATE);
        Customer c1 = new Customer("Pinky", 3);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, null);
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, item3, item4};
        c1.addItems(items);

        for (Clothing item : c1.getItems()) {
            System.out.println(item.toString());
        }
        int average = 0;
        int count = 0;
        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }

        try {
            average = average / count;
            System.out.println("Average price is " + average + ", Count is " + count);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

        Arrays.sort(c1.getItems());
        for (Clothing item : c1.getItems()) {
            System.out.println(item.toString());
        }
        System.out.println("Total amount: " + c1.getTotalClothingCost());

    }

}

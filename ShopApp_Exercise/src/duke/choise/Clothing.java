/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choise;

/**
 *
 * @author Sinisa
 */
public class Clothing implements Comparable<Clothing>{
    private String description;
    private double price;
    private String size;
    public static final double MIN_PRICE = 10;
    public static final double TAX_RATE = 0.2;

    @Override
    public String toString() {
        return "Item: " + description + ", " + price + ", " + size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price * (1 + TAX_RATE);
    }

    public void setPrice(double price) {
            this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = (size != null) ? size : "M";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }
}

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
public class Customer {
    private String name;
    private String size;
    private Clothing[] items;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void setSize(int measurement) {
        switch (measurement) {
            case 1: case 2: case 3:
                setSize("S");
                break;
            case 4: case 5: case 6:
                setSize("M");
                break;
            case 7: case 8: case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }
    
    public Clothing[] getItems() {
        return this.items;
    }
    
    public void addItems(Clothing[] someItems) {
        this.items = someItems;
    }
    
    public double getTotalClothingCost() {
        double total = 0;
        for (Clothing item: getItems()) {
                total += item.getPrice();
                //if (total > 15) break;       
        }
        
        return total;
    }

    public Customer(String name, int measurement) {
        this.name = name;
        this.setSize(measurement);
    }
}

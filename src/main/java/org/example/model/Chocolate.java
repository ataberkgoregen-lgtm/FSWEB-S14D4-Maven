package org.example.model;

public class Chocolate extends ProductForSale {
    private int calories;
    public Chocolate(String type, int price, String description, int calories) {
        super(type, price, description);
        this.calories = calories;
    }
    public Chocolate(String type, int price, String description) {
        super(type, price, description);

    }

    public void showDetails(){
        System.out.println(calories);
    };
}

package org.example.model;

public class Bread extends ProductForSale {
    private int calories;

    public Bread(String type, int price, String description) {
        super(type, price, description);

    }

    public Bread(String type, int price, String description, int calories) {
        super(type, price, description);
        this.calories = calories;
    }

    public void showDetails(){
        System.out.println(calories);
    };

}

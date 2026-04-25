package org.example.model;

public class Coke extends ProductForSale {
    private int calories;
    public Coke(String type, int price, String description, int calories) {
        super(type, price, description);
        this.calories = calories;
    }
    public Coke(String type, int price, String description) {
        super(type, price, description);

    }
    public void showDetails(){
        System.out.println(calories);
    };
}

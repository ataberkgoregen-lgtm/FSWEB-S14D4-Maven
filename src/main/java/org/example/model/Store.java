package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] prd = new ProductForSale[3];

        prd[0] = new Bread("Kepek", 15, "Düşük kalori", 140);
        prd[1] = new Chocolate("Sütlü Çikolata", 30, "Yüksek Kalori", 400);
        prd[2] = new Coke("Zero Sugar", 50,  "Kalori sonsuz", 10000);


        listProducts(prd);
    }

    public static void listProducts(ProductForSale[] products) {

        for(int i = 0; i < products.length; i++) {
            products[i].showDetails();
        }

    }
}
package org.example;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addItem(Product product) {
        products.add(product);
    }

    public void removeItem(Product product) {
        products.remove(product);
    }

    public void calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            double price = product.getPrice();
            totalPrice += price;
        }
        System.out.println(totalPrice);
    }


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}



package org.example;

public class Main {
    public static void main(String[] args) {

        ShoppingCart productShoppingCart = new ShoppingCart();

        Product milk = new Milk(1, "zuzu", 10);
        Product milk1 = new Milk(2, "covalact", 11.5);
        Product milk2 = new Milk(3, "proxi", 10.7);
        Product bread = new Bread(4, "panemar", 22.5);
        Product bread1 = new Bread(5, "la casa", 54.8);

        productShoppingCart.addItem(milk);
        productShoppingCart.addItem(milk1);
        productShoppingCart.addItem(milk2);
        productShoppingCart.addItem(bread);
        productShoppingCart.addItem(bread1);

        System.out.println(productShoppingCart);
        productShoppingCart.calculateTotalPrice();

        productShoppingCart.removeItem(milk1);
        productShoppingCart.removeItem(bread);

        Milk milk3 = new Milk(6, "nsc", 43);
        productShoppingCart.addItem(milk3);

        Bread bread2 = new Bread(7, "nsc", 21);
        productShoppingCart.addItem(bread2);

        System.out.println(productShoppingCart);
        productShoppingCart.calculateTotalPrice();
    }
}
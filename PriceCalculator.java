package com.demo.shop;

public class PriceCalculator {
    public double totalWithTax(double price, int quantity, double taxRate) {
        return price * quantity * (1 + taxRate);
    }
}

package com.example.myapplication;

public class Item implements SaleCount {
    String name;
    int price;
    int sale;

    public Item(String name, int price, int sale) {
        this.name = name;
        this.price = price;
        this.sale = sale;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSale() {
        return sale;
    }

    @Override
    public int countSale(int price, int sale) {
        return price/sale * 100;
    }
}

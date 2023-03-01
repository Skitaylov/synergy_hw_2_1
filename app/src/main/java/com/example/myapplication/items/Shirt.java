package com.example.myapplication.items;

import com.example.myapplication.Item;

public class Shirt extends Item {
    public Shirt(String name, int price, int sale) {
        super(name, price, sale);
    }
    @Override
    public int countSale(int price, int sale) {
        if(sale==-1) return price;
        return (100-sale)*price/100;
    }
}

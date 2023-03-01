package com.example.myapplication.items;

import com.example.myapplication.Item;

public class Shoes extends Item {
    public Shoes(String name, int price, int sale) {
        super(name, price, sale);
    }
    @Override
    public int countSale(int price, int sale) {
        if(sale==-1) return price;
        return (100-sale)*price/100;
    }
}

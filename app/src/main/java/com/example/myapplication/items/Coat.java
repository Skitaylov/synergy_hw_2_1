package com.example.myapplication.items;

import com.example.myapplication.Item;

public class Coat extends Item {
    public Coat(String name, int price, int sale) {
        super(name, price, sale);
    }
    @Override
    public int countSale(int price, int sale) {
        if(sale==-1) return price;
        return (100-sale)*price/100;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public int getSale() {
        return super.getSale();
    }
}

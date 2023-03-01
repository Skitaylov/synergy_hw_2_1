package com.example.myapplication;

public class BalanceUtil {
    public static boolean checkBalance(int balance, int price){
        return balance >= price;
    }
    public static int balanceRemain(int balance, int balanceSpent){
        return balance - balanceSpent;
    }
}

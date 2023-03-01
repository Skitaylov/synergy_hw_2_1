package com.example.myapplication;

import android.annotation.SuppressLint;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.myapplication.items.*;

public class MainActivity extends AppCompatActivity {
    public static final int BALANCE = 312;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Item buisnessSuit = new BusinessSuit("деловой̆ костюм", 53, 44);
        Item coat = new Coat("пальто", 70, 77);
        Item hat = new Hat("шляпа", 25, 37);
        Item shirt = new Shirt("сорочка", 19, 0);
        Item shoes = new Shoes("туфли", 41, 32);



        TextView possibilityOut = findViewById(R.id.possibilityOut);
        TextView balanceOut = findViewById(R.id.balanceOut);
        balanceOut.setText(BALANCE+" | "+BalanceUtil.balanceRemain(BALANCE,
                coat.countSale(70, 77)
                        +buisnessSuit.countSale(53,44)
                        +hat.countSale(25,37)
                        +shirt.countSale(19, 0)
                        +shoes.countSale(41,32)));
        if (BalanceUtil.checkBalance(BALANCE, coat.countSale(70, 77)
                +buisnessSuit.countSale(53,44)
                +hat.countSale(25,37)
                +shirt.countSale(19, 0)
                +shoes.countSale(41,32))) {
            possibilityOut.setText("Можно купить");
        }
    }
}
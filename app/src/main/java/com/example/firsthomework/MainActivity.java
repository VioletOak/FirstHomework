package com.example.firsthomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//Имеется несколько товаров для делового гардероба с ценами и размерами скидок:
    // пальто - 70 серебряных монет ( + скидка 77%)
    // шляпа - 25 серебряных монет ( + скидка 37%)
    // деловой̆ костюм - 53 серебряных монет ( + скидка 44%
    // сорочка - 19 серебряных монет (нет скидки);
    // туфли - 41 серебряная монета ( + скидка 32%)
    // На счету имеется 312 серебряных монет
    // Необходимо рассчитать, хватит ли имеющихся средств для покупки делового гардероба.

    float coat = 70;
    byte coatDiscount = 77;
    float hat = 25;
    byte hatDiscount = 37;
    float BSuit = 53;
    byte BSuitDiscount = 44;
    float shirt = 19;
    float shoe = 41;
    byte shoeDiscount = 32;
    float account = 312;

    private float calculation() {
        float count = (coat * (100 - coatDiscount) + hat * (100 - hatDiscount) +
                BSuit * (100 - BSuitDiscount) + shirt + shoe * (100 - shoeDiscount)) / 100;
        return count;
    }

    private boolean possibility() {
        if (calculation() <= account) {
            return true;
        } else {
            return false;
        }
    }

    private TextView possibilityOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possibilityOut = findViewById(R.id.possibilityOut);
        if (possibility()) {
            possibilityOut.setText("Средств достаточо");
        } else {
            possibilityOut.setText("Средств не доостаточно");
        }
    }
}
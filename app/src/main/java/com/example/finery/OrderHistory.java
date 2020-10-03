package com.example.finery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderHistory extends AppCompatActivity {

    Button prevoiusRates_btn,Rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);


        prevoiusRates_btn=findViewById(R.id.view_previous_rates_btn);
        Rate = findViewById(R.id.button_);


        prevoiusRates_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderHistory.this,PreviousRates.class);
                startActivity(intent);
            }
        });


        Rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderHistory.this,GiveRates.class);
                startActivity(intent);
            }
        });

    }
}
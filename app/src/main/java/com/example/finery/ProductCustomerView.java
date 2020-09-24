package com.example.finery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProductCustomerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_product_customer_view);
    }
}
package com.example.finery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CartActivity extends AppCompatActivity {

    private Button btnDel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        btnDel = (Button)findViewById(R.id.button2);
    }
    public void onClick(View view) {
        Intent i;
        i=new Intent(this,DeliveryDetails.class);startActivity(i);
    }
}
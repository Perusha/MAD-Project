package com.example.finery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Order_history_example extends AppCompatActivity {

    Button GIve_RAtes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history_example);

        GIve_RAtes = findViewById(R.id.ratethis);

        GIve_RAtes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Order_history_example.this,GiveRates.class);
                startActivity(intent);
            }
        });
    }
}
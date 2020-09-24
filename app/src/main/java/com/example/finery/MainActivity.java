package com.example.finery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCart, btnPoduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCart = (Button)findViewById(R.id.btnCart);
        btnPoduct = (Button) findViewById(R.id.btnProducts);
        btnPoduct.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent i;

        switch(view.getId())
        {
            case R.id.btnCart : i=new Intent(this,CartActivity.class);startActivity(i);break;
            case R.id.btnProducts : i = new Intent(this, ProductCustomerView.class);startActivity(i);break;
            default:break;
        }

    }
}
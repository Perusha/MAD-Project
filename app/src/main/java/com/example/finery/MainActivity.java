package com.example.finery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnCart, btnAccountsettings, btnAboutUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCart = (Button)findViewById(R.id.btnCart);
        btnAccountsettings = (Button)findViewById(R.id.btnAccountsettings);
        btnAboutUs = (Button)findViewById(R.id.btnAboutUs);
    }


    public void onClick(View view) {
        Intent i;

        switch(view.getId())
        {
            case R.id.btnCart : i=new Intent(this,CartActivity.class);startActivity(i);break;
            case R.id.btnAccountsettings :  i=new Intent(this,MyProfile.class);startActivity(i);break;
            case R.id.btnAboutUs:  i=new Intent(this,AboutUs.class);startActivity(i);break;



            default:break;
        }

    }
}
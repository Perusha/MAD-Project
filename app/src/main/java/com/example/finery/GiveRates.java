package com.example.finery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class GiveRates extends AppCompatActivity {

    EditText editTextTitle,editTextCom;
    Button buttonAdd,buttonShow,buttonUpdate,buttonDelete;
    DatabaseReference dbRef;
    Rate std;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_rates);

        editTextTitle = findViewById(R.id.giveTitle1);
        editTextCom = findViewById(R.id.comment);

        std = new Rate();
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbRef = FirebaseDatabase.getInstance().getReference().child("Rates");

                try {
                    if (TextUtils.isEmpty(editTextTitle.getText().toString()))
                        Toast.makeText(getApplicationContext(),"Please enter a Title",Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(editTextCom.getText().toString()))
                        Toast.makeText(getApplicationContext(),"Please enter a Comment",Toast.LENGTH_SHORT).show();
                    else {
                        std.setProductTitle(editTextTitle.getText().toString().trim());
                        std.setComment(editTextCom.getText().toString().trim());

                        dbRef.push().setValue(std);

                        Toast.makeText(getApplicationContext(),"Data Saved Successfully ",Toast.LENGTH_LONG).show();
                    }
                }
                catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Invalid Product ID",Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
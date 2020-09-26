package com.example.finery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Feedback extends AppCompatActivity {

    EditText editTextName,editTextPname,editTextDes;
    Button buttonSave,buttonUP,buttonDEL;
    DatabaseReference dbRef;
    Feed fed;

    private void clearControls(){
        editTextName.setText("");
        editTextPname.setText("");
        editTextDes.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        editTextName = findViewById(R.id.editTextName);
        editTextPname = findViewById(R.id.editTextPname);
        editTextDes = findViewById(R.id.editTextDes);

        buttonSave = findViewById(R.id.buttonSave);
        buttonUP = findViewById(R.id.buttonUP);
        buttonDEL = findViewById(R.id.buttonDEL);

        fed = new Feed();

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbRef = FirebaseDatabase.getInstance().getReference().child("Feed");

                try {
                    if (TextUtils.isEmpty(editTextName.getText().toString()))
                        Toast.makeText(getApplicationContext(),"Please enter a name",Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(editTextPname.getText().toString()))
                        Toast.makeText(getApplicationContext(),"Please enter a product name",Toast.LENGTH_SHORT).show();
                    else if (TextUtils.isEmpty(editTextDes.getText().toString()))
                        Toast.makeText(getApplicationContext(),"Please enter a description",Toast.LENGTH_SHORT).show();
                    else {
                        fed.setName(editTextName.getText().toString().trim());
                        fed.setProname(editTextPname.getText().toString().trim());
                        fed.setDescription(editTextDes.getText().toString().trim());

                        dbRef.push().setValue(fed);

                        Toast.makeText(getApplicationContext(),"Successfully Added Your Feedback",Toast.LENGTH_LONG).show();
                        clearControls();
                    }
                }
                catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Invalid Contact Number",Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
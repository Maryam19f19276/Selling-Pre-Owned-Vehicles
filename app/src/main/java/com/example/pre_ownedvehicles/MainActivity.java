package com.example.pre_ownedvehicles;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private EditText emaila,pass;
    private Button login;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;
    String email,password;
    Cardata cardata;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emaila=(EditText) findViewById(R.id.editText2);
        pass=(EditText) findViewById(R.id.edt1);
        login= (Button) findViewById(R.id.button);


        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Cardata");
        cardata = new Cardata();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Homepade.class);
                startActivity(intent);
                finish();

                email = emaila.getEditableText().toString();
                password = pass.getEditableText().toString();


                if ( TextUtils.isEmpty(email) && TextUtils.isEmpty(password)) {
                    Toast.makeText(MainActivity.this, "Enter Data", Toast.LENGTH_SHORT).show();
                } else {
                    addDatatoFirebase( email, password);
                }
            }
        });
    }

    private void addDatatoFirebase(String Email, String Pass) {

        cardata.setEmail(email);
        cardata.setPassword(password);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                databaseReference.setValue(cardata);
                Toast.makeText(MainActivity.this, "data add", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(MainActivity.this, "Fail to add data"+error, Toast.LENGTH_SHORT).show();


            }
        });


            }
        }


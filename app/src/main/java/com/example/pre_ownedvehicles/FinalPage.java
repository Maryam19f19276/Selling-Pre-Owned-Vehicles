package com.example.pre_ownedvehicles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FinalPage extends AppCompatActivity {
    private EditText editTextQuantity;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);

        editTextQuantity = findViewById(R.id.editTextQuantity);
        Button buttonPlaceOrder = findViewById(R.id.buttonPlaceOrder);
        buttonPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                placeOrder();
            }

        });
    }
    private void placeOrder() {
        String quantity = editTextQuantity.getText().toString().trim();

        if (!quantity.isEmpty()) {
            // Process the order (you can send the order to a server, save it locally, etc.)
            Toast.makeText(this, "Order placed for " + quantity + " items.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Please enter a valid quantity.", Toast.LENGTH_SHORT).show();
        }

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FinalPage.this, Order.class);
                startActivity(intent);
                finish();
            }
        });
    }}
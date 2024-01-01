package com.example.pre_ownedvehicles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Order extends AppCompatActivity {
    private EditText editTextCardNumber, editTextExpiryDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        editTextCardNumber = findViewById(R.id.editTextCardNumber);
        editTextExpiryDate = findViewById(R.id.editTextExpiryDate);
        Button buttonSubmitPayment = findViewById(R.id.buttonSubmitPayment);

        buttonSubmitPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitPayment();
            }
        });
    }

    private void submitPayment() {
        String cardNumber = editTextCardNumber.getText().toString().trim();
        String expiryDate = editTextExpiryDate.getText().toString().trim();

        if (!cardNumber.isEmpty() && !expiryDate.isEmpty()) {
            // Process the payment (you can send payment details to a payment gateway, etc.)
            Toast.makeText(this, "Payment submitted for card ending with " +
                    cardNumber.substring(cardNumber.length() - 4), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Please enter valid card details.", Toast.LENGTH_SHORT).show();
        }
    }
}






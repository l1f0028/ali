package com.example.projectterminator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class wallet extends AppCompatActivity {

    EditText walletNameEditText;
    EditText cardNumberEditText;
    EditText expirationDateEditText;
    EditText cvvEditText;
    Button saveWalletButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallet);

        walletNameEditText = findViewById(R.id.walletNameEditText);
        cardNumberEditText = findViewById(R.id.cardNumberEditText);
        expirationDateEditText = findViewById(R.id.expirationDateEditText);
        cvvEditText = findViewById(R.id.cvvEditText);
        saveWalletButton = findViewById(R.id.saveWalletButton);

        saveWalletButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String walletName = walletNameEditText.getText().toString().trim();
                String cardNumber = cardNumberEditText.getText().toString().trim();
                String expirationDate = expirationDateEditText.getText().toString().trim();
                String cvv = cvvEditText.getText().toString().trim();

                if (walletName.isEmpty()) {
                    Toast.makeText(wallet.this, "Wallet Name is required", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (cardNumber.isEmpty() || cardNumber.length() != 16) {
                    Toast.makeText(wallet.this, "Card Number must be 16 digits", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (expirationDate.isEmpty() || expirationDate.length() != 5 || !expirationDate.contains("/")) {
                    Toast.makeText(wallet.this, "Invalid Expiration Date format (MM/YY)", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (cvv.isEmpty() || cvv.length() != 3) {
                    Toast.makeText(wallet.this, "CVV must be 3 digits", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(wallet.this, "Wallet Saved Successfully!", Toast.LENGTH_SHORT).show();
                walletNameEditText.setText("");
                cardNumberEditText.setText("");
                expirationDateEditText.setText("");
                cvvEditText.setText("");
            }
        });
    }
}

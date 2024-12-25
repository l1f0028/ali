package com.example.projectterminator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity {

    EditText emailEditText, passwordEditText;
    Button loginButton;
    String usernameFromSignUp, emailFromSignUp, passwordFromSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        Intent intent = getIntent();
        usernameFromSignUp = intent.getStringExtra("username");
        emailFromSignUp = intent.getStringExtra("email");
        passwordFromSignUp = intent.getStringExtra("password");

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(signin.this, "Please enter both fields", Toast.LENGTH_SHORT).show();
                } else if (checkLogin(email, password)) {
                    Toast.makeText(signin.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(signin.this, welcome.class));
                } else {
                    Toast.makeText(signin.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private boolean checkLogin(String email, String password) {
        return email.equals(emailFromSignUp) && password.equals(passwordFromSignUp);
    }
}

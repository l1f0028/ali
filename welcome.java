package com.example.projectterminator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class welcome extends AppCompatActivity {

    TextView welcomeMessage;
    Button viewProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        welcomeMessage = findViewById(R.id.welcomeMessage);
        viewProfileButton = findViewById(R.id.viewProfileButton);

        viewProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcome.this, activity_home.class);
                startActivity(intent);
            }
        });
    }
}

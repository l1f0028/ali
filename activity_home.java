package com.example.projectterminator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class activity_home extends AppCompatActivity {

    TextView titleTextView;
    TextView subtitleTextView;
    ImageButton fabAddButton;
    ImageButton navTripsButton;
    ImageButton navTripButton;
    ImageButton navProButton;
    ImageButton navUnfiledButton;
    ImageButton navTriButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize the UI elements
        titleTextView = findViewById(R.id.title);
        subtitleTextView = findViewById(R.id.subtitle);
        fabAddButton = findViewById(R.id.fab_add);
        navTripsButton = findViewById(R.id.nav_trips);
        navTripButton = findViewById(R.id.nav_trip);
        navProButton = findViewById(R.id.nav_pro);
        navUnfiledButton = findViewById(R.id.nav_unfiled);
        navTriButton = findViewById(R.id.nav_tri);

        fabAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_home.this, addtrip.class);
                startActivity(intent);
            }
        });

        navTripsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to trips activity
                Intent intent = new Intent(activity_home.this, upcoming_trips.class);
                startActivity(intent);
            }
        });

        navTripButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_home.this, activity_alerts.class);
                startActivity(intent);
            }
        });

        navProButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_home.this, wallet.class);
                startActivity(intent);
            }
        });

        navUnfiledButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_home.this, unfiled.class);
                startActivity(intent);
            }
        });

        navTriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_home.this, activity_account.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.projectterminator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class addtrip extends AppCompatActivity {

    EditText tripNameEditText;
    EditText destinationEditText;
    EditText startDateEditText;
    EditText endDateEditText;
    EditText notesEditText;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtrip);

        tripNameEditText = findViewById(R.id.tripNameEditText);
        destinationEditText = findViewById(R.id.destinationEditText);
        startDateEditText = findViewById(R.id.startDateEditText);
        endDateEditText = findViewById(R.id.endDateEditText);
        notesEditText = findViewById(R.id.notesEditText);
        saveButton = findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tripName = tripNameEditText.getText().toString().trim();
                String destination = destinationEditText.getText().toString().trim();
                String startDate = startDateEditText.getText().toString().trim();
                String endDate = endDateEditText.getText().toString().trim();
                String notes = notesEditText.getText().toString().trim();

                if (tripName.isEmpty() || destination.isEmpty() || startDate.isEmpty() || endDate.isEmpty() || notes.isEmpty()) {
                    Toast.makeText(addtrip.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(addtrip.this, "Trip Saved: " + tripName, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

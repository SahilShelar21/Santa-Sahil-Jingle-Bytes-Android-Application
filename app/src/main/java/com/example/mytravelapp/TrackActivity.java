package com.example.mytravelapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mytravelapp.R;

public class TrackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);  // R.layout.activity_main refers to the XML layout

        // Find the TextView by its ID
        TextView textView = findViewById(R.id.textView);

        // You can change the text programmatically
        textView.setText("Welcome to my app!");  // Changes the text
    }
}

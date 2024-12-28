package com.example.mytravelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // Optionally, if you want to programmatically set onClick listeners
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        // Setting click listener for all buttons (optional)
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextPage();
            }
        };

        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
    }

    // Method that will be called when any of the buttons are clicked
    public void goToNextPage() {
        // Create an intent to navigate to NextPageActivity
        Intent intent = new Intent(OrderActivity.this, AddressActivity.class);
        startActivity(intent);
    }
}

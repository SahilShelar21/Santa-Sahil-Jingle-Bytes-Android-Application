package com.example.mytravelapp;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class GeneratedCard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_card);

        String to = getIntent().getStringExtra("TO");
        String from = getIntent().getStringExtra("FROM");

        TextView cardTo = findViewById(R.id.cardTo);
        TextView cardFrom = findViewById(R.id.cardFrom);

        cardTo.setText("To: " + to);
        cardFrom.setText("From: " + from);
    }
}

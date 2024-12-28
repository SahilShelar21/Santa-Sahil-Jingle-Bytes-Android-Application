package com.example.mytravelapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class CardActivity extends AppCompatActivity {
    private EditText toInput, fromInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        toInput = findViewById(R.id.toInput);
        fromInput = findViewById(R.id.fromInput);

        Button generateCardButton = findViewById(R.id.generateCardButton);
        generateCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to = toInput.getText().toString();
                String from = fromInput.getText().toString();

                Intent intent = new Intent(CardActivity.this, GeneratedCard.class);
                intent.putExtra("TO", to);
                intent.putExtra("FROM", from);
                startActivity(intent);
            }
        });
    }
}

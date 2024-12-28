package com.example.mytravelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView a = findViewById(R.id.cardview1);
        CardView b = findViewById(R.id.cardview2);
        CardView c = findViewById(R.id.cardview3);
        CardView d = findViewById(R.id.cardview4);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open Activity1 (replace Activity1.class with the actual class)
                openActivity1();
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open Activity2 (replace Activity2.class with the actual class)
                openActivity2();
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open Activity3 (replace Activity3.class with the actual class)
                openActivity3();
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open Activity4 (replace Activity4.class with the actual class)
                openActivity4();
            }
        });
    }

    private void openActivity1() {
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }

    private void openActivity2() {
        Intent intent = new Intent(this, TrackActivity.class);
        startActivity(intent);
    }

    private void openActivity3() {
        Intent intent = new Intent(this, RecipeActivity.class);
        startActivity(intent);
    }

    private void openActivity4() {
        Intent intent = new Intent(this, CardActivity.class);
        startActivity(intent);
    }
}

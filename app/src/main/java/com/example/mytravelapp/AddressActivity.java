package com.example.mytravelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AddressActivity extends AppCompatActivity {

    private EditText userName, userAddress, userMobile;
    private CheckBox checkClothes, checkToys, checkChocolates, checkShoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        userName = findViewById(R.id.userName);
        userAddress = findViewById(R.id.userAddress);
        userMobile = findViewById(R.id.userMobile);
        checkClothes = findViewById(R.id.checkClothes);
        checkToys = findViewById(R.id.checkToys);
        checkChocolates = findViewById(R.id.checkChocolates);
        checkShoes = findViewById(R.id.checkShoes);
        Button generateOrder = findViewById(R.id.generateOrder);

        generateOrder.setOnClickListener(v -> {
            String name = userName.getText().toString();
            String address = userAddress.getText().toString();
            String mobile = userMobile.getText().toString();

            ArrayList<String> selectedItems = new ArrayList<>();
            if (checkClothes.isChecked()) selectedItems.add("Clothes");
            if (checkToys.isChecked()) selectedItems.add("Toys");
            if (checkChocolates.isChecked()) selectedItems.add("Chocolates");
            if (checkShoes.isChecked()) selectedItems.add("Shoes");

            if (name.isEmpty() || address.isEmpty() || mobile.isEmpty()) {
                Toast.makeText(AddressActivity.this, "Please fill all details!", Toast.LENGTH_SHORT).show();
                return;
            }

            // Show a toast message after clicking the button
            Toast.makeText(AddressActivity.this, "Your order is confirmed... Santa will come soon... Merry Christmas!", Toast.LENGTH_LONG).show();

        });
    }
}

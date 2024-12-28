package com.example.mytravelapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {


    EditText edUsername,edEmail,edPassword,edConfirm;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edUsername = findViewById(R.id.RegUsername);
        edPassword = findViewById(R.id.RegPassword);
        edEmail = findViewById(R.id.RegEmail);
        edConfirm = findViewById(R.id.ConfirmPassword);
        btn = findViewById(R.id.buttonRegister);
        tv = findViewById(R.id.ExistingUser);

        tv.setOnClickListener(view -> startActivity(new Intent(RegisterActivity.this, LoginActivity.class)));

        btn.setOnClickListener(v -> {
            String username = edUsername.getText().toString();
            String email = edEmail.getText().toString();
            String password = edPassword.getText().toString();
            String confirm = edConfirm.getText().toString();
            Database db = new Database(getApplicationContext(), "MyTravels", null, 1);
            if (username.length() == 0 || email.length() == 0 || password.length() == 0 || confirm.length() == 0) {
                Toast.makeText(getApplicationContext(), "Please fill all details", Toast.LENGTH_SHORT).show();
            } else {
                if (password.compareTo(confirm) == 0) {
                    if (isvalid(password)) {
                        db.register(username, email, password);
                        Toast.makeText(getApplicationContext(), "record inserted", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                    } else {
                        Toast.makeText(getApplicationContext(), "Password must contain 8 letters,and digit,symbol", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Password not matched with confirm Password", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegisterActivity.this,RegisterActivity.class));
                    db.register(username, email, password);
                }
            }
        });
    }
    public static boolean isvalid(String passwordhere){
        int f1=0,f2=0,f3=0;
        if (passwordhere.length()<8){
            return false;
        } else{
            for (int p = 0; p<passwordhere.length(); p++){
                if (Character.isLetter(passwordhere.charAt(p))){
                    f1=1;
                }
            }
            for (int r = 0; r <passwordhere.length(); r++){
                if (Character.isDigit(passwordhere.charAt(r))){
                    f2=1;
                }
            }
            for (int s = 0; s <passwordhere.length(); s++){
                char c = passwordhere.charAt(s);
                if (c>=33&&c<=46||c==64){
                    f3=1;
                }
            }
            if(f1==1 && f2==1 && f3==1)
                return true;
            return false;
        }
    }
}


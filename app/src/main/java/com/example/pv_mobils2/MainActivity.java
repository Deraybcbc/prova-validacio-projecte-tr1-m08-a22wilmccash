package com.example.pv_mobils2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Message;
    Button Login;
    Intent SecondScreen;
    String[] options = {"SMS", "email"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Message = findViewById(R.id.messageText);
        Login = findViewById(R.id.loginButton);
        Login.setOnClickListener(view -> {
            SecondScreen = new Intent(this, SecondActivity.class);
            SecondScreen.putExtra("message", String.valueOf(Message.getText()));
            startActivity(SecondScreen);
        });

    }
}
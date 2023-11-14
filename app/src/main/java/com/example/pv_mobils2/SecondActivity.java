package com.example.pv_mobils2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.navigation.ui.AppBarConfiguration;


import com.example.pv_mobils2.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySecondBinding binding;
    TextView messageText;
    String message;
    Intent SecondScreen;
    Spinner messageOptions;
    String[] sendOptions = {"SMS", "email"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());

        ArrayAdapter options = new ArrayAdapter(this, android.R.layout.simple_spinner_item, sendOptions);

        setContentView(binding.getRoot());
        messageOptions = findViewById(R.id.options);
        messageText = findViewById(R.id.secondMessageText);
        SecondScreen = getIntent();
        message = SecondScreen.getStringExtra("message");
        options.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        messageOptions.setAdapter(options);

        messageText.setText(message);
    }
}
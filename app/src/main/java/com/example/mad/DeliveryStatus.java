package com.example.mad;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DeliveryStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delivery_status);
        getSupportActionBar().hide();
    }
}
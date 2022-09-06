package com.example.musicshop;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseQuantity(View view) {
        TextView quantityTextView  = findViewById(R.id.quantityTextView);
int x ;
int sum=0;
        quantityTextView.setText(x=sum+1);
    }
}
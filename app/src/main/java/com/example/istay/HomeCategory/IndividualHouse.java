package com.example.istay.HomeCategory;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.istay.R;

public class IndividualHouse extends AppCompatActivity {

    TextView homeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_house);

        Intent intent = getIntent();
        String houseName = intent.getStringExtra("HouseName");
    }

}

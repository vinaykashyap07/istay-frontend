package com.example.istay.HomeCategory;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.example.istay.Adapter.AmenitiesImageAdapter;
import com.example.istay.R;

public class IndividualHouse extends AppCompatActivity {

    private GridView gridView;

    static final String[] AMENITY_TYPES = new String[] {
            "Android", "iOS","Windows", "Blackberry" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_house);

        Typeface typeface = ResourcesCompat.getFont(this, R.font.blacklist);
        TextView appname = findViewById(R.id.appname);
        appname.setTypeface(typeface);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        gridView = (GridView) findViewById(R.id.grid_view_amenity);

        gridView.setAdapter(new AmenitiesImageAdapter(this, AMENITY_TYPES));

    }



}

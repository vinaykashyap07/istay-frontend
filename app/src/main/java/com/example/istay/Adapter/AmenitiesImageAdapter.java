package com.example.istay.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.istay.R;

public class AmenitiesImageAdapter extends BaseAdapter {

    private Context context;
    private String[] amenityValues;

    public AmenitiesImageAdapter(Context context, String[] amenityValues) {
        this.context = context;
        this.amenityValues = amenityValues;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);

            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.amenities_view_holder, null);

            // set value into textview
            TextView textView = (TextView) gridView
                    .findViewById(R.id.amenity_text);
            textView.setText(amenityValues[position]);

            // set image based on selected text
            ImageView imageView = (ImageView) gridView
                    .findViewById(R.id.amenity_image);

            String amenity = amenityValues[position];

            if (amenity.equals("Windows")) {
                imageView.setImageResource(R.drawable.for_whom);
            } else if (amenity.equals("iOS")) {
                imageView.setImageResource(R.drawable.single_person);
            } else if (amenity.equals("Blackberry")) {
                imageView.setImageResource(R.drawable.share);
            } else {
                imageView.setImageResource(R.drawable.similar);
            }

        } else {
            gridView = (View) convertView;
        }

        //resizeGridView(gridView.,(int)(amenityValues.length/2));
        return gridView;
    }

    private static void resizeGridView(GridView gridView, int rows) {
        int measuredHeight = gridView.getMeasuredHeight();
        ViewGroup.LayoutParams params = gridView.getLayoutParams();
        params.height = measuredHeight * rows;
        gridView.setLayoutParams(params);
        gridView.requestLayout();
    }

    @Override
    public int getCount() {
        return amenityValues.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}


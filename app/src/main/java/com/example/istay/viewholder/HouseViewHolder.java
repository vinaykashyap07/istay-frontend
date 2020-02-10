package com.example.istay.viewholder;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.example.istay.HomeCategory.IndividualHouse;
import com.example.istay.R;
import com.example.istay.interfaces.OnItemClickListener;
import com.example.istay.models.SingleHouseModel;

import java.util.ArrayList;

public class HouseViewHolder extends RecyclerView.ViewHolder{

    private TextView houseName;
    private TextView houseAddress;
    private TextView occupancyDetail;
    private TextView textForWhom;
    private TextView price;
    private SliderLayout sliderShow;


    public HouseViewHolder(View view){
        super(view);
        houseName =(TextView) view.findViewById(R.id.house_name);
        houseAddress =(TextView) view.findViewById(R.id.house_address);
        occupancyDetail =(TextView) view.findViewById(R.id.occupancy_detail);
        textForWhom =(TextView) view.findViewById(R.id.text_for_whom);
        price =(TextView) view.findViewById(R.id.price);
        // Using Image Slider -----------------------------------------------------------------------
        sliderShow = (SliderLayout)view.findViewById(R.id.room_photos);
    }

    public void bindData(final SingleHouseModel viewModel, final OnItemClickListener listener) {
        houseName.setText(viewModel.getHouseName());
        houseAddress.setText(viewModel.getHouseAddress());
        occupancyDetail.setText(viewModel.getOccupancy());
        textForWhom.setText(viewModel.getForWhom());
        price.setText(viewModel.getTripleSharingPrice());

        ArrayList<String> sliderImages = viewModel.getImages();
        inflateImageSlider(sliderShow.getContext(),sliderImages);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemView.getContext(), IndividualHouse.class);
                intent.putExtra("HouseName",houseName.getText());

                itemView.getContext().startActivity(intent);
            }
        });

//        itemView.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(HouseViewHolder.this);
//                intent.putExtra("product",getItem(position));
//                startActivity(intent);
//            }
//        });

//        viewHolder.mView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Tshirts.this,IndividualProduct.class);
//                intent.putExtra("product",getItem(position));
//                startActivity(intent);
//            }
//        });

    }

    private void inflateImageSlider(Context context, ArrayList<String> sliderImages) {

        //populating Image slider
        ArrayList<String> sliderImage = sliderImages;

        for (String s : sliderImage) {
            DefaultSliderView sliderView = new DefaultSliderView(context);
            sliderView.image(s);
            sliderShow.addSlider(sliderView);
        }
        sliderShow.stopAutoCycle();
        sliderShow.setPresetIndicator(SliderLayout.PresetIndicators.Right_Bottom);

    }
}

package com.example.istay.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.example.istay.R;
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

    public void bindData(final SingleHouseModel viewModel) {
        houseName.setText(viewModel.getHouseName());
        houseAddress.setText(viewModel.getHouseAddress());
        occupancyDetail.setText(viewModel.getOccupancy());
        textForWhom.setText(viewModel.getForWhom());
        price.setText(viewModel.getTripleSharingPrice());
        inflateImageSlider(sliderShow.getContext());
    }

    private void inflateImageSlider(Context context) {

        //populating Image slider
        ArrayList<String> sliderImages = new ArrayList<>();
        sliderImages.add("https://www.printstop.co.in/images/flashgallary/large/Business_stationery_home_banner.jpg");
        sliderImages.add("https://www.printstop.co.in/images/flashgallary/large/calendar-diaries-home-banner.jpg");
        sliderImages.add("https://www.printstop.co.in/images/flashgallary/large/calendar-diaries-banner.jpg");
        sliderImages.add("https://www.printstop.co.in/images/flashgallary/large/free-visiting-cards-home-banner.jpg");

        for (String s : sliderImages) {
            DefaultSliderView sliderView = new DefaultSliderView(context);
            sliderView.image(s);
            sliderShow.addSlider(sliderView);
        }

        sliderShow.setPresetIndicator(SliderLayout.PresetIndicators.Right_Bottom);

    }

}

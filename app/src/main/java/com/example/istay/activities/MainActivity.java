package com.example.istay.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.example.istay.Adapter.HouseCardAdapter;
import com.example.istay.R;
import com.example.istay.models.SingleHouseModel;
import com.example.istay.networksync.CheckInternetConnection;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private SliderLayout sliderShow;
    HouseCardAdapter houseCardAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        houseCardAdapter = new HouseCardAdapter(generateHouseList());
        RecyclerView recyclerView =
                (RecyclerView)findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(houseCardAdapter);

//        Typeface typeface = ResourcesCompat.getFont(this, R.font.blacklist);
//        TextView appname = findViewById(R.id.appname);
//        appname.setTypeface(typeface);

        new CheckInternetConnection(this).checkConnection();

        //inflateImageSlider();

    }

    private List<SingleHouseModel> generateHouseList(){

        List<SingleHouseModel> simpleViewModelList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            SingleHouseModel model = new SingleHouseModel();
            model.setHouseName("house name hn:"+i);
            model.setHouseAddress("house address haddress:"+i);
            model.setOccupancy("house name hn:"+i);
            model.setTripleSharingPrice("triple + 100"+i);
            model.setOccupancy("private"+i);
            model.setForWhom("Boys"+i);

            simpleViewModelList.add(model);
        }

        return simpleViewModelList;

    }


    private void inflateImageSlider() {

        // Using Image Slider -----------------------------------------------------------------------
        sliderShow = findViewById(R.id.room_photos);

        //populating Image slider
        ArrayList<String> sliderImages = new ArrayList<>();
        sliderImages.add("https://www.printstop.co.in/images/flashgallary/large/Business_stationery_home_banner.jpg");
        sliderImages.add("https://www.printstop.co.in/images/flashgallary/large/calendar-diaries-home-banner.jpg");
        sliderImages.add("https://www.printstop.co.in/images/flashgallary/large/calendar-diaries-banner.jpg");
        sliderImages.add("https://www.printstop.co.in/images/flashgallary/large/free-visiting-cards-home-banner.jpg");

        for (String s : sliderImages) {
            DefaultSliderView sliderView = new DefaultSliderView(this);
            sliderView.image(s);
            sliderShow.addSlider(sliderView);
        }

        sliderShow.setPresetIndicator(SliderLayout.PresetIndicators.Right_Bottom);

    }

}

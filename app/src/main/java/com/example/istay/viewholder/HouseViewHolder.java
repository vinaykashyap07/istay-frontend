package com.example.istay.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.istay.R;
import com.example.istay.models.SingleHouseModel;

public class HouseViewHolder extends RecyclerView.ViewHolder{

    private TextView houseName;
    private TextView houseAddress;
    private TextView occupancyDetail;
    private TextView textForWhom;
    private TextView price;

    public HouseViewHolder(View view){
        super(view);
        houseName =(TextView) view.findViewById(R.id.house_name);
        houseAddress =(TextView) view.findViewById(R.id.house_address);
        occupancyDetail =(TextView) view.findViewById(R.id.occupancy_detail);
        textForWhom =(TextView) view.findViewById(R.id.text_for_whom);
        price =(TextView) view.findViewById(R.id.price);
    }

    public void bindData(final SingleHouseModel viewModel) {
        houseName.setText(viewModel.getHouseName());
        houseAddress.setText(viewModel.getHouseAddress());
        occupancyDetail.setText(viewModel.getOccupancy());
        textForWhom.setText(viewModel.getForWhom());
        price.setText(viewModel.getTripleSharingPrice());
    }

}

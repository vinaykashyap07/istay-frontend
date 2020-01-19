package com.example.istay.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.istay.R;
import com.example.istay.models.SingleHouseModel;
import com.example.istay.viewholder.HouseViewHolder;

import java.util.ArrayList;
import java.util.List;

public class HouseCardAdapter extends RecyclerView.Adapter {

    private List<SingleHouseModel> models = new ArrayList<>();

    public HouseCardAdapter(List<SingleHouseModel> viewModels){
        if(viewModels != null){
            this.models.addAll(viewModels);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new HouseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((HouseViewHolder) holder).bindData(models.get(position));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.card_row_item;
    }
}

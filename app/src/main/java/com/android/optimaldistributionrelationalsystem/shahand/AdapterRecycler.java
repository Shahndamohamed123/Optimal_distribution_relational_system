package com.android.optimaldistributionrelationalsystem.shahand;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.optimaldistributionrelationalsystem.databinding.RecycleItemBinding;

import java.util.ArrayList;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.Holder> {

    ArrayList<orderItem> pl;

    Context con;

    public AdapterRecycler(ArrayList<orderItem> pl, Context con) {
        this.pl = pl;
        this.con = con;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecycleItemBinding binding = RecycleItemBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);
        return new Holder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        final orderItem items = pl.get(position);

        holder.binding.productName.setText(items.getName());
        holder.binding.number.setText(items.getNumber());
        holder.binding.imageView.setImageResource(items.getOrderImage());

//        holder.binding.materialButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //here put what the button doing
//            }
//        });
    }

    @Override
    public int getItemCount() {

        return pl.size();
    }

    static class Holder extends RecyclerView.ViewHolder {

        RecycleItemBinding binding;

        public Holder(RecycleItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

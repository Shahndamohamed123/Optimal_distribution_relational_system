package com.android.optimaldistributionrelationalsystem.shahand;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.android.optimaldistributionrelationalsystem.R;
import com.android.optimaldistributionrelationalsystem.Status2Activity;
import com.android.optimaldistributionrelationalsystem.databinding.ActivityViewItemBinding;

import java.util.ArrayList;

public class ViewItemActivity extends AppCompatActivity {

    ActivityViewItemBinding binding;

    ArrayList<orderItem> orderItems;
    AdapterRecycler adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        binding.recyclerView.setAdapter(adapter);

        orderItems = new ArrayList<>();
        orderItems.add(new orderItem("IPhone", 14000, R.drawable.iphone));

        adapter = new AdapterRecycler(orderItems, this);
        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // there no thing left put list of data in adapter

        onClick();
    }

    private void onClick() {

        binding.iconBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ViewItemActivity.this, Status2Activity.class);
                startActivity(intent);
            }
        });

    }

}
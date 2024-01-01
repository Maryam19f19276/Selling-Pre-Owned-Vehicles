package com.example.pre_ownedvehicles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Car extends AppCompatActivity {
    private List<Myltem> myltemList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        myltemList.add(new Myltem("Toyota"));
        myltemList.add(new Myltem("BMW"));

        RecyclerView recyclerView = findViewById(R.id.mn);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter =new MyAdapter(myltemList);
        recyclerView.setAdapter(adapter);


    }
}
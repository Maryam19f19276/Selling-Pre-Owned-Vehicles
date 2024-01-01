package com.example.pre_ownedvehicles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Rquipment extends AppCompatActivity {
    private List<Myltem> myltemList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rquipment);

        myltemList.add(new Myltem("sun visor"));
        myltemList.add(new Myltem(" tires"));

        RecyclerView recyclerView = findViewById(R.id.mn);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Myada adapter =new Myada(myltemList);
        recyclerView.setAdapter(adapter);
    }
}
package com.example.pre_ownedvehicles;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyView extends RecyclerView.ViewHolder {

    TextView nameView;
    public MyView(@NonNull View itemView) {
        super(itemView);
        nameView=itemView.findViewById(R.id.mk);
    }
}

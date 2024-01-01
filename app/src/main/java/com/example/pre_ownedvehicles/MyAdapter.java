package com.example.pre_ownedvehicles;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.core.Context;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyView> {
    Context context;
    List<Myltem> items;

    public MyAdapter (List<Myltem> items ){
        this.context=context;
        this.items=items;

    }
    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyView(LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyView holder, int position) {
        holder.nameView.setText(items.get(position).getItemName());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}

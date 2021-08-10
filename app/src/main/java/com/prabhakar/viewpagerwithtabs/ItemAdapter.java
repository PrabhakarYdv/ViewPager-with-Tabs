package com.prabhakar.viewpagerwithtabs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private ArrayList<String> itemLists;

    public ItemAdapter(ArrayList<String> itemLists) {
        this.itemLists = itemLists;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        String str=itemLists.get(position);
        holder.setData(str);
    }

    @Override
    public int getItemCount() {
        return itemLists.size();
    }
}

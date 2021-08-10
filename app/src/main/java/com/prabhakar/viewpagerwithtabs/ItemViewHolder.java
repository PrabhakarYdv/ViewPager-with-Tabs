package com.prabhakar.viewpagerwithtabs;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    private TextView name;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
    }
    public void setData(String str){
        name.setText(str);
    }
}

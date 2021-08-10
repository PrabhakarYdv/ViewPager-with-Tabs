package com.prabhakar.viewpagerwithtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;


public class FragmentB extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<String> placeList;
    @Override
    public void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildPlaceList();
        setAdapter();
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }

    private void buildPlaceList() {
        placeList = new ArrayList<>();
        String[] places = {"Munger","Patna","Ranchi","Jamalapur","Mohanpur","Shadipur","bangalore", "Safiyabad", "Mumbai", "Kolkata", "Goa", "Vishakhapatnam", "Hyedrabad", "Shimla", "Hisar", "Gurugram"};
        Collections.addAll(placeList,places);
    }

    private void setAdapter() {
        ItemAdapter itemAdapter= new ItemAdapter(placeList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(itemAdapter);

    }
}
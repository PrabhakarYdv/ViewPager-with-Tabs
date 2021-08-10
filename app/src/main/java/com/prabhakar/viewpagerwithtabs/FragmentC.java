package com.prabhakar.viewpagerwithtabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;


public class FragmentC extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<String> touristPlaceList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildTouristPlaceList();
        setAdapter();
    }


    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }

    private void buildTouristPlaceList() {
        touristPlaceList = new ArrayList<>();
        String[] touristPlaces = {"Yoga Ashram","Ganga Bridge","Kali Pahar","Circuit House","Karan Chaura","Sita Kund","PirPahar","Company Garden","Filter","Rajgir","Bhim Bandh","Rishi Kund",
                "munnar","coalkers walk","love lake","abhey falls", "Red Fort", "Nahargarh Fort", "Jal Mahal", "Taj Mahal", "Connaught Place", "Hawa Mahal", "Raj Ghat","Sair Sapata"};
        Collections.addAll(touristPlaceList,touristPlaces);
    }

    private void setAdapter() {
        ItemAdapter itemAdapter = new ItemAdapter(touristPlaceList);
//        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(itemAdapter);
    }
}
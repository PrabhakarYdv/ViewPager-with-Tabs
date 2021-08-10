package com.prabhakar.viewpagerwithtabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;


public class FragmentA extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<String> nameList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildNameList();
        setAdapter();
    }


    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);

    }

    private void buildNameList() {
        nameList= new ArrayList<>();
        String []names={"Prabhakar","Diwakar","Ashish","Anurag","Abhishek","Saurav","Mahipal","Sanny","Arpit","Arvind","Sunny","Puja","Pooja","Sonam","Taskeen","Golu","Matlu","Ghatlu","Aditya","Scahin","Amit","Allu Arjun","Ajay","Adarsh","Shasi","Shivam","Surya","Ranjeet","Narendra",
        "Rana","Sai Krishan","Llyod","Siddharth","Kunal","Shubham","Sudharshan","Prachi","Arya","Reeta"};
        Collections.addAll(nameList,names);
    }

    private void setAdapter() {
        ItemAdapter itemAdapter= new ItemAdapter(nameList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(itemAdapter);
    }
}
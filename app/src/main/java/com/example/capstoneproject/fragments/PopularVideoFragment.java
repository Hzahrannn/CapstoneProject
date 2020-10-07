package com.example.capstoneproject.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.capstoneproject.R;
import com.example.capstoneproject.adapter.MainAdapter;
import com.example.capstoneproject.model.DataModel;
import com.example.capstoneproject.model.Model;

import java.util.ArrayList;
import java.util.List;

public class PopularVideoFragment extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private MainAdapter MainAdapter;
    private List<Model> Model;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_popular_video,container,false);
        recyclerView = (RecyclerView)view.findViewById(R.id.rv);
        layoutManager = new LinearLayoutManager(getActivity());

        initView();
        Model = new ArrayList<>();
        MainAdapter = new MainAdapter(this, Model);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(MainAdapter);

        setData();

        return view;
    }


    private void setData() {
        List<Model> dummyData = DataModel.movielist();
        MainAdapter.updateData(dummyData);
    }

    private void initView(){
        recyclerView = recyclerView.findViewById(R.id.rv);
    }

}
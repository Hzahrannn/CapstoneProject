package com.example.capstoneproject.fragments;

import android.graphics.Movie;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.capstoneproject.R;
import com.example.capstoneproject.adaptors.MoviePageListAdaptor;
import com.example.capstoneproject.model.Result;
import com.example.capstoneproject.viewmodels.MainViewModel;
import com.example.capstoneproject.viewmodels.MainViewModelFactory;

public class PopularVideoFragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private MoviePageListAdaptor adaptor;
    private MainViewModel viewModel;
    private String sort_criteria= "popular";

    public PopularVideoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_popular_video, container, false);

        viewModel = ViewModelProviders.of(this,new MainViewModelFactory(sort_criteria)).get(MainViewModel.class);
        recyclerView = (RecyclerView)view.findViewById(R.id.pr);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        adaptor = new MoviePageListAdaptor();

        recyclerView.setAdapter(adaptor);

        viewModel.geLlistLiveData().observe(this, new Observer<PagedList<Result>>() {
            @Override
            public void onChanged(PagedList<Result> results) {
                if(results!=null){
                    adaptor.submitList(results);
                }
            }
        });
        return view;
    }
}
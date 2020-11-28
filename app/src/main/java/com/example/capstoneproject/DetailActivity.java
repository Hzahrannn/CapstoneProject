package com.example.capstoneproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private TextView tvNamaMovie;
    private TextView tvRATE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
        tvNamaMovie.setText(getIntent().getStringExtra("nama_barang"));
        tvRATE.setText(getIntent().getStringExtra("qty"));

    }

    private void initView() {
        tvNamaMovie = findViewById(R.id.tv_nama_movie);
        tvRATE = findViewById(R.id.tv_rate);
    }
}

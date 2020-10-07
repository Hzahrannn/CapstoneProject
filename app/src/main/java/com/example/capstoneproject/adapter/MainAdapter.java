package com.example.capstoneproject.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.capstoneproject.DetailActivity;
import com.example.capstoneproject.R;
import com.example.capstoneproject.fragments.PopularVideoFragment;
import com.example.capstoneproject.model.Model;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private Context Context;
    private List<Model> Model = new ArrayList<>();

    public MainAdapter(PopularVideoFragment context, List<Model> Model) {
        this.Context = Context;
        this.Model = Model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        Model Models = Model.get(position);
        holder.tvNamaMovie.setText(Models.getName());
        holder.tvRATE.setText(String.valueOf(Models.getRate()));
        holder.cvKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Context, DetailActivity.class);
                intent.putExtra("nama_movie", holder.tvNamaMovie.getText().toString().trim());
                intent.putExtra("rate", holder.tvRATE.getText().toString().trim());
                Context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return Model.size();
    }

    public void updateData(List<Model> movielist) {
        this.Model = movielist;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNamaMovie;
        private TextView tvRATE;
        private CardView cvKlik;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaMovie = itemView.findViewById(R.id.tv_nama_movie);
            tvRATE = itemView.findViewById(R.id.tv_rate);
            cvKlik = itemView.findViewById(R.id.cv_klik);
        }
    }
}

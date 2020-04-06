package com.example.mobileapp.recyclerviewpb3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mobile App on 12/1/2017.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder>{

    private ArrayList<Movie>movies;
    private Context context;

    public MovieAdapter(ArrayList<Movie> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.movie_single_row,parent,false);
        return new MovieViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.movieIV.setImageResource(movies.get(position).getMovieImage());
        holder.movieNameTV.setText(movies.get(position).getMovieName());
        holder.movieYearTV.setText(movies.get(position).getReleaseYear());
        holder.movieCategoryTV.setText(movies.get(position).getMovieCategory());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{

        ImageView movieIV;
        TextView movieNameTV;
        TextView movieYearTV;
        TextView movieCategoryTV;

        public MovieViewHolder(View itemView) {
            super(itemView);
            movieIV = itemView.findViewById(R.id.movieImage);
            movieNameTV = itemView.findViewById(R.id.movieName);
            movieYearTV = itemView.findViewById(R.id.movieYear);
            movieCategoryTV = itemView.findViewById(R.id.movieCategory);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
}

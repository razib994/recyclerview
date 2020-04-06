package com.example.mobileapp.recyclerviewpb3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class MainActivity extends AppCompatActivity {

    private RecyclerView movieRV;
    private MovieAdapter movieAdapter;
    private Movie movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieRV = findViewById(R.id.movieRV);
        movie = new Movie();
        movieAdapter = new MovieAdapter(movie.getAllMovies(),this);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);

        GridLayoutManager glm = new GridLayoutManager(this,2);
        StaggeredGridLayoutManager sglm = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        movieRV.setLayoutManager(sglm);
        movieRV.setAdapter(movieAdapter);
    }
}

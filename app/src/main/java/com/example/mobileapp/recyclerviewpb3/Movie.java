package com.example.mobileapp.recyclerviewpb3;

import java.util.ArrayList;

/**
 * Created by Mobile App on 12/1/2017.
 */

public class Movie {
    private int movieImage;
    private String movieName;
    private String releaseYear;
    private String movieCategory;

    public Movie(int movieImage, String movieName, String releaseYear, String movieCategory) {
        this.movieImage = movieImage;
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.movieCategory = movieCategory;
    }

    public Movie() {
    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public ArrayList<Movie> getAllMovies(){
        ArrayList<Movie>movies = new ArrayList<>();
        movies.add(new Movie(R.drawable.movie,"Titanic","1998","Adventer"));
        movies.add(new Movie(R.drawable.movie,"Iron Man","2008","Action/SiFi"));
        movies.add(new Movie(R.drawable.movie,"Transformers","2007","Action/SiFi"));
        movies.add(new Movie(R.drawable.movie,"Thor: The Dark World","2014","Action/SiFi"));
        return movies;
    }
}

package com.example.movieinfo.models;

public class Movie {
    String title;
    String rating;
    String description;
    public Movie(String title, String rating, String description) {
        this.title = title;
        this.rating = rating;
        this.description = description;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}

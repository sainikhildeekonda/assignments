package com.example.movieinfo.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.movieinfo.R;
import com.example.movieinfo.models.Movie;

import java.util.ArrayList;

public class MovieCustomAdapter extends BaseAdapter {

    ArrayList<Movie>movies;
    public MovieCustomAdapter(ArrayList<Movie>movies)
    {
        this.movies=movies;
    }
    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

   
}

package com.example.movieinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.movieinfo.adapters.MovieCustomAdapter;
import com.example.movieinfo.models.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    ArrayList<Movie>movies;

    public ArrayList<Movie> generateMovies()
    {
        ArrayList<Movie> movies=new ArrayList<>();
        movies.add(new Movie("BAHUBALI 2", "Best VFX movie", "9/10", R.drawable.bahubali));
        movies.add(new Movie("GOLD", "Best Motivational movie", "8.5/10", R.drawable.gold));
        movies.add(new Movie("ANDHADHUN", "Best Suspense Thriller", "8.5/10", R.drawable.andhadhun));
        movies.add(new Movie("LAGAAN", "Feel Good Movie", "9/10", R.drawable.lagaan));
        movies.add(new Movie("PADMAAVAT", "Best Historical movie", "8/10", R.drawable.padmaavat));
        movies.add(new Movie("BAJIRAO MASTANI", "Epic Historical Romance", "8.5/10", R.drawable.bajirao));
        movies.add(new Movie("DIL BECHARA", "Coming of age romance", "8/10", R.drawable.dilbechara));
        movies.add(new Movie("GULLY BOY", "Musical Drama", "7.5/10", R.drawable.gully));
        movies.add(new Movie("JODHA AKBAR", "Historical Romance film", "6/10", R.drawable.jodha));
        movies.add(new Movie("SPECIAL 26", "Hindi language heist film", "6.5/10", R.drawable.special26));
        return movies;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.movieListView);
        movies=generateMovies();
        MovieCustomAdapter adapter=new MovieCustomAdapter(movies);
        listView.setAdapter(adapter);

    }
}
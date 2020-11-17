package com.example.movieinfo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
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
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        ViewHolder viewHolder;
        if(view==null)
        {
            view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_row,null);
            viewHolder=new ViewHolder(view);
            view.setTag(viewHolder);
        }
        else
        {
            viewHolder=(ViewHolder)view.getTag();
        }
        Movie movies= (Movie) getItem(position);
        viewHolder.title.setText(movies.getTitle());
        viewHolder.rating.setText(movies.getRating());
        viewHolder.description.setText(movies.getDescription());
        viewHolder.imageView.setImageResource(movies.getMovieImages());
        return view;
    }

    class ViewHolder
    {
        TextView title;
        TextView rating;
        TextView description;
        ImageView imageView;

        public ViewHolder(View view)
        {
            title=view.findViewById(R.id.movieTitle);
            rating=view.findViewById(R.id.rating);
            description=view.findViewById(R.id.description);
            imageView=view.findViewById(R.id.imageView);
        }
    }

}

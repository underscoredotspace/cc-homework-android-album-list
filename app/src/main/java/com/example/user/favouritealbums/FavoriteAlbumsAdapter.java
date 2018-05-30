package com.example.user.favouritealbums;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class FavoriteAlbumsAdapter extends ArrayAdapter<Album> {
    public FavoriteAlbumsAdapter(Context context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_layout, parent, false);
        }

        Album currentAlbum = getItem(position);

        TextView title = listItemView.findViewById(R.id.title);
        title.setText(currentAlbum.getTitle());

        TextView artist = listItemView.findViewById(R.id.artist);
        artist.setText(currentAlbum.getArtist());

        TextView year = listItemView.findViewById(R.id.year);
        year.setText(Integer.toString(currentAlbum.getReleaseYear()));

        TextView chart_position = listItemView.findViewById(R.id.chart_position);
        chart_position.setText(Integer.toString(currentAlbum.getChartPosition()));

        listItemView.setTag(currentAlbum);

        return listItemView;

    }
}

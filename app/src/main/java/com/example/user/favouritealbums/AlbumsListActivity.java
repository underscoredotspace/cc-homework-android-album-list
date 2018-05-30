package com.example.user.favouritealbums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums_list);

        FavoriteAlbums favoriteAlbums = new FavoriteAlbums();
        ArrayList<Album> albums = favoriteAlbums.getList();

        FavoriteAlbumsAdapter albumsAdapter = new FavoriteAlbumsAdapter(this, albums);

        ListView listView = findViewById(R.id.albumsList);
        listView.setAdapter(albumsAdapter);
    }

    public void onListItemClick(View listItem) {
        Album album = (Album) listItem.getTag();
        Log.d("Album Title: ", album.getTitle());
    }
}

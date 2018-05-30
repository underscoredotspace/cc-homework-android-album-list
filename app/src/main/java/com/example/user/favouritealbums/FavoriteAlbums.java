package com.example.user.favouritealbums;

import java.util.ArrayList;

public class FavoriteAlbums {
    private ArrayList<Album> albums;

    public FavoriteAlbums() {
        this.albums = new ArrayList<>();
    }

    public void addAlbum(String artist, String title, int releaseYear, int chartPosition) {
        Album newAlbum = new Album(artist, title, releaseYear, chartPosition);
        this.albums.add(newAlbum);
    }

    public ArrayList<Album> getList() {
        return new ArrayList<>(this.albums);
    }
}

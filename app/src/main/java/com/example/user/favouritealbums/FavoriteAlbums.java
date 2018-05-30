package com.example.user.favouritealbums;

import java.util.ArrayList;

public class FavoriteAlbums {
    private ArrayList<Album> albums;

    public FavoriteAlbums() {
        this.albums = new ArrayList<>();

        this.addAlbum("Ben Folds", "So There", 2015, 63);
        this.addAlbum("Courtney Barnett", "Tell Me How You Really Feel", 2018, 9);
    }

    public void addAlbum(String artist, String title, int releaseYear, int chartPosition) {
        Album newAlbum = new Album(artist, title, releaseYear, chartPosition);
        this.albums.add(newAlbum);
    }

    public ArrayList<Album> getList() {
        return new ArrayList<>(this.albums);
    }
}

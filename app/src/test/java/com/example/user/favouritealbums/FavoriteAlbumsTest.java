package com.example.user.favouritealbums;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FavoriteAlbumsTest {
    FavoriteAlbums albums;

    @Before
    public void before() {
        albums = new FavoriteAlbums();
    }

    @Test
    public void getList() {
        assertEquals(0, albums.getList().size());
    }

    @Test
    public void addAlbum() {
        albums.addAlbum("Ben Folds", "So There", 2015, 63);
        albums.addAlbum("Courtney Barnett", "Tell Me How You Really Feel", 2018, 9);
        assertEquals(2, albums.getList().size());

    }
}
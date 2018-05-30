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
        assertEquals(2, albums.getList().size());
    }

    @Test
    public void addAlbum() {
        albums.addAlbum("Prince", "Purple Rain", 1983, 1);
        assertEquals(3, albums.getList().size());

    }
}
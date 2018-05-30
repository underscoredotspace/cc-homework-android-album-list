package com.example.user.favouritealbums;

import com.example.user.favouritealbums.Album;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlbumTest {
    private Album album;

    @Before
    public void before() {
        album = new Album("Ben Folds", "So There", 2015, 63);
    }

    @Test
    public void getArtist() {
        assertEquals("Ben Folds", album.getArtist());
    }

    @Test
    public void getTitle() {
        assertEquals("So There", album.getTitle());
    }

    @Test
    public void getReleaseYear() {
        assertEquals(2015, album.getReleaseYear());
    }

    @Test
    public void getChartPosition() {
        assertEquals(63, album.getChartPosition());
    }
}
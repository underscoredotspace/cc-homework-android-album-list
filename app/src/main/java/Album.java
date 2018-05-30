public class Album {
    private String artist;
    private String title;
    private int releaseYear;
    private int chartPosition;

    public Album(String artist, String title, int releaseYear, int chartPosition) {
        this.artist = artist;
        this.title = title;
        this.releaseYear = releaseYear;
        this.chartPosition = chartPosition;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getChartPosition() {
        return chartPosition;
    }
}

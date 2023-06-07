package Playlist;

import java.util.LinkedList;

public abstract class Playlist {
    private String title;
    private String author;
    private String genre;

    public Playlist(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
    public abstract void addSong(Song song);
    public abstract LinkedList<Song> getSongs();
    public abstract Song removeSong();
}

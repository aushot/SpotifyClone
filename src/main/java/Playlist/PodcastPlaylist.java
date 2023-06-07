package Playlist;

import java.util.LinkedList;

public class PodcastPlaylist extends Playlist{
    private LinkedList<Song> podcastPlaylist = new LinkedList<>();
    public PodcastPlaylist(String title, String author, String genre) {
        super(title, author, genre);
    }


    @Override
    public void addSong(Song song) {
        podcastPlaylist.push(song);
    }

    @Override
    public LinkedList getSongs() {
        return podcastPlaylist;
    }

    @Override
    public Song removeSong() {
        return podcastPlaylist.removeFirst();
    }
}

package Playlist;

import java.util.LinkedList;

public class SystemPlaylist extends Playlist{
    private LinkedList<Song> systemPlaylist = new LinkedList<>();
    public SystemPlaylist(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void addSong(Song song) {
        systemPlaylist.add(song);
    }

    @Override
    public LinkedList getSongs() {
        return systemPlaylist;
    }

    @Override
    public Song removeSong() {
        return systemPlaylist.remove();
    }

    public void removeSong(Song song){
        systemPlaylist.remove(song);
    }
    public void getSong(int i){
        systemPlaylist.get(i);
    }

    public LinkedList<Song> getSystemPlaylist() {
        return systemPlaylist;
    }
}

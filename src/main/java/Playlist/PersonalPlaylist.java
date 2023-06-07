package Playlist;

import java.util.LinkedList;
import java.util.Queue;

public class PersonalPlaylist extends Playlist{

    public Queue<Song> personalPlaylist = new LinkedList<>();

    public PersonalPlaylist(String title, String author, String genre) {
        super(title, author, genre);
    }

    public void addSong(Song song) {
        personalPlaylist.add(song);
    }

    @Override
    public LinkedList getSongs() {
        return (LinkedList) personalPlaylist;
    }

    @Override
    public Song removeSong() {
        return personalPlaylist.remove();
    }

}

package User;

import Playlist.*;

import java.util.ArrayList;

public class User {
    private String username;
    private String name;
    private String surname;
    private UserType userType;
    private ArrayList<Playlist> playlists = new ArrayList<>();

    public User(String username, String name, String surname, UserType userType) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.userType = userType;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void addPlaylist(String title, String genre){
        Playlist playlist = null;

        switch (getUserType()) {
            case SystemUser -> playlist = new SystemPlaylist(title, genre, username);
            case CreatorUser -> playlist = new PodcastPlaylist(title, genre, username);
            case CommonUser -> playlist = new PersonalPlaylist(title,genre, username);
        }

        playlists.add(playlist);
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }
}

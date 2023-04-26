package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title,duration));
            System.out.println("Song " + title + " added to " + name + " album");
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for (Song song : songs) {
            if(song.getTitle().equals(title))
                return song;
        }
        return null;
    }

    public boolean addToPlayList(int numberOfSong, LinkedList<Song> playlist){
        if(numberOfSong - 1 > songs.size() || numberOfSong - 1 < 0){
            return false;
        }
        playlist.add(songs.get(numberOfSong - 1));
        System.out.println("Song " + songs.get(numberOfSong - 1).getTitle() + " added to the playlist");
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song song = findSong(title);
        if(song == null)
            return false;
        playlist.add(song);
        System.out.println("Song " + song.getTitle() + " added to the playlist");
        return true;
    }
}

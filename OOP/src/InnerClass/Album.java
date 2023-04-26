package InnerClass;

import java.util.ArrayList;
import java.util.LinkedList;


public class Album {
    private String name, artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        if(songs.findSong(title) == null){
            songs.add(new Song(title,duration));
            System.out.println("Song " + title + " added to " + name + " album");
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int numberOfSong, LinkedList<Song> playlist){
        if(numberOfSong - 1 > songs.songs.size() || numberOfSong - 1 < 0){
            return false;
        }
        playlist.add(songs.songs.get(numberOfSong - 1));
        System.out.println("Song " + songs.songs.get(numberOfSong - 1).getTitle() + " added to the playlist");
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song song = songs.findSong(title);
        if(song == null)
            return false;
        playlist.add(song);
        System.out.println("Song " + song.getTitle() + " added to the playlist");
        return true;
    }


    public static class SongList{
        private ArrayList<Song> songs;

        private SongList(){
            songs = new ArrayList<>();
        }

        private boolean add(Song song){
            if(findSong(song.getTitle()) != null){
                return false;
            }
            songs.add(song);
            return true;
        }

        private Song findSong(String title){
            for (Song song : songs) {
                if(song.getTitle().equals(title))
                    return song;
            }
            return null;
        }

        private Song findSong(int truckNumber){
            if(truckNumber < songs.size()){
                return songs.get(truckNumber);
            }
            return null;
        }
    }
}

package com.xworkz.spotifyapp.spotify;

import com.xworkz.spotifyapp.song.Song;

public class Spotify {

    private Song[] songs = new Song[21];
    int index;

    public boolean addSong(Song song) {

        boolean isAdded = false;
        boolean isSongIdValid = false;
        boolean isSongNameValid = false;
        boolean isSingerValid = false;
        boolean isLanguageValid = false;

        int songId = song.getSongId();

        if (songId > 0) {
            isSongIdValid = true;
        } else {
            System.out.println("Song Id is Invalid");
        }

        String songName = song.getSongName();

        if (songName != null && !songName.isEmpty()) {
            isSongNameValid = true;
        } else {
            System.out.println("Song Name is Invalid");
        }

        String singer = song.getSinger();

        if (singer != null && !singer.isEmpty()) {
            isSingerValid = true;
        } else {
            System.out.println("Singer Name is Invalid");
        }

        String language = song.getLanguage();

        if (language != null && !language.isEmpty()) {
            isLanguageValid = true;
        } else {
            System.out.println("Language is Invalid");
        }

        if (isSongIdValid && isSongNameValid && isSingerValid && isLanguageValid) {

            songs[index++] = song;
            isAdded = true;
        }

        return isAdded;
    }

    public void getAllSongs() {

        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
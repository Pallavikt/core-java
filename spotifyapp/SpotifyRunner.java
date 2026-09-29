package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.song.Song;
import com.xworkz.spotifyapp.spotify.Spotify;

public class SpotifyRunner {

    public static void main(String[] args) {

        Spotify spotify = new Spotify();

        Song song = new Song();
        song.setSongId(1);
        song.setSongName("Belageddu");
        song.setSinger("Vijay Prakash");
        song.setLanguage("Kannada");
        spotify.addSong(song);

        Song song1 = new Song();
        song1.setSongId(2);
        song1.setSongName("Anisuthide");
        song1.setSinger("Sonu Nigam");
        song1.setLanguage("Kannada");
        spotify.addSong(song1);

        Song song2 = new Song();
        song2.setSongId(3);
        song2.setSongName("Bombe Helutaithe");
        song2.setSinger("Vijay Prakash");
        song2.setLanguage("Kannada");
        spotify.addSong(song2);

        Song song3 = new Song();
        song3.setSongId(4);
        song3.setSongName("Singara Siriye");
        song3.setSinger("Vijay Prakash");
        song3.setLanguage("Kannada");
        spotify.addSong(song3);

        Song song4 = new Song();
        song4.setSongId(5);
        song4.setSongName("Neenade Naa");
        song4.setSinger("Sonu Nigam");
        song4.setLanguage("Kannada");
        spotify.addSong(song4);

        Song song5 = new Song();
        song5.setSongId(6);
        song5.setSongName("Kesariya");
        song5.setSinger("Arijit Singh");
        song5.setLanguage("Hindi");
        spotify.addSong(song5);

        Song song6 = new Song();
        song6.setSongId(7);
        song6.setSongName("Tum Hi Ho");
        song6.setSinger("Arijit Singh");
        song6.setLanguage("Hindi");
        spotify.addSong(song6);

        Song song7 = new Song();
        song7.setSongId(8);
        song7.setSongName("Apna Bana Le");
        song7.setSinger("Arijit Singh");
        song7.setLanguage("Hindi");
        spotify.addSong(song7);

        Song song8 = new Song();
        song8.setSongId(9);
        song8.setSongName("Chaleya");
        song8.setSinger("Arijit Singh");
        song8.setLanguage("Hindi");
        spotify.addSong(song8);

        Song song9 = new Song();
        song9.setSongId(10);
        song9.setSongName("Tujh Mein Rab Dikhta Hai");
        song9.setSinger("Roop Kumar Rathod");
        song9.setLanguage("Hindi");
        spotify.addSong(song9);

        Song song10 = new Song();
        song10.setSongId(11);
        song10.setSongName("Perfect");
        song10.setSinger("Ed Sheeran");
        song10.setLanguage("English");
        spotify.addSong(song10);

        Song song11 = new Song();
        song11.setSongId(12);
        song11.setSongName("Shape of You");
        song11.setSinger("Ed Sheeran");
        song11.setLanguage("English");
        spotify.addSong(song11);

        Song song12 = new Song();
        song12.setSongId(13);
        song12.setSongName("Someone Like You");
        song12.setSinger("Adele");
        song12.setLanguage("English");
        spotify.addSong(song12);

        Song song13 = new Song();
        song13.setSongId(14);
        song13.setSongName("Blinding Lights");
        song13.setSinger("The Weeknd");
        song13.setLanguage("English");
        spotify.addSong(song13);

        Song song14 = new Song();
        song14.setSongId(15);
        song14.setSongName("Love Story");
        song14.setSinger("Taylor Swift");
        song14.setLanguage("English");
        spotify.addSong(song14);

        Song song15 = new Song();
        song15.setSongId(16);
        song15.setSongName("Butta Bomma");
        song15.setSinger("Armaan Malik");
        song15.setLanguage("Telugu");
        spotify.addSong(song15);

        Song song16 = new Song();
        song16.setSongId(17);
        song16.setSongName("Samajavaragamana");
        song16.setSinger("Sid Sriram");
        song16.setLanguage("Telugu");
        spotify.addSong(song16);

        Song song17 = new Song();
        song17.setSongId(18);
        song17.setSongName("Inkem Inkem Inkem Kaavaale");
        song17.setSinger("Sid Sriram");
        song17.setLanguage("Telugu");
        spotify.addSong(song17);

        Song song18 = new Song();
        song18.setSongId(19);
        song18.setSongName("Arabic Kuthu");
        song18.setSinger("Anirudh Ravichander");
        song18.setLanguage("Tamil");
        spotify.addSong(song18);

        Song song19 = new Song();
        song19.setSongId(20);
        song19.setSongName("Why This Kolaveri Di");
        song19.setSinger("Dhanush");
        song19.setLanguage("Tamil");
        spotify.addSong(song19);

        Song song20 = new Song();
        song20.setSongId(21);
        song20.setSongName("Vaathi Coming");
        song20.setSinger("Anirudh Ravichander");
        song20.setLanguage("Tamil");
        spotify.addSong(song20);

        spotify.getAllSongs();
    }
}
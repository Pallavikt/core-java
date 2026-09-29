package com.xworkz.spotifyapp.song;

public class Song {

    private int songId;
    private String songName;
    private String singer;
    private String language;

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Song(songId = " + this.songId + ", songName = " + this.songName +
                ", singer = " + this.singer + ", language = " + this.language + ")";
    }
}
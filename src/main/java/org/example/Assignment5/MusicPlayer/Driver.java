package org.example.Assignment5.MusicPlayer;

public class Driver {
    public static void main(String[] args) {
        MusicPlayerInterface mp3Player = new MP3Player();
        MusicPlayerInterface wavPlayer = new WAVPlayer();

        mp3Player.play("favorite_song.mp3");
        mp3Player.stop(); // calls default method from the interface

        wavPlayer.play("classical_track.wav");
        wavPlayer.stop();
    }
}

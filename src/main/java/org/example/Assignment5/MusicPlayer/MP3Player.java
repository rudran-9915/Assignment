package org.example.Assignment5.MusicPlayer;

public class MP3Player implements MusicPlayerInterface{
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3: " + fileName);
    }
}

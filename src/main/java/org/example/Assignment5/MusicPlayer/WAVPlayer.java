package org.example.Assignment5.MusicPlayer;

public class WAVPlayer implements MusicPlayerInterface{
    @Override
    public void play(String fileName) {
        System.out.println("Playing WAV: " + fileName);
    }
}

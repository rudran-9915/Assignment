package org.example.Assignment5.MusicPlayer;

public interface MusicPlayerInterface {
    void play(String fileName);
    default void stop(){
        System.out.println("Music stopped");
    }
}

package edu.hanu.a1_2001040108;

import java.util.concurrent.atomic.AtomicInteger;

public class Letter {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private int image;
    private int audio;

    //    int audio
    public Letter(int image, int audio) {
        this.id = count.incrementAndGet();
        this.image = image;
        this.audio = audio;
    }

    public int getId() {
        return id;
    }

    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}

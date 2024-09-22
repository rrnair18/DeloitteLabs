package com.deloitte.lab4.ex3;

class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(int id, String title, int numberOfCopies, int runtime, String artist, String genre) {
        super(id, title, numberOfCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public void print() {
        System.out.println("CD Details: " + toString() + ", Artist: " + artist + ", Genre: " + genre);
    }
}
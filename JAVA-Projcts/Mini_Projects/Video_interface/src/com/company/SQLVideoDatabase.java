package com.company;

public class SQLVideoDatabase implements VideoDatabase { // this implemets SQL DATABASE
    @Override
    public void store(Video video) {
        // passing video as a reference.
        // getting all the video info here
        System.out.println("Storing video metadata in a SQL database...");
        System.out.println("Title: " + video.getTitle());
        System.out.println("File Name: " + video.getFileName());
        System.out.println("Done!\n");
    }
}

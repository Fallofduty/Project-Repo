package com.company;

public class VideoProcessor {
    private VideoEncoder encoder; // creating reference to all thesse
    private SQLVideoDatabase database;
    private Notifications notifications;

    public VideoProcessor(VideoEncoder encoder, SQLVideoDatabase database, Notifications notifications) {
        this.encoder = encoder;
        this.database = database;
        this.notifications = notifications;
    }

    public void process(Video video) {
      encoder.encode(video); // just passing video here as reference
      database.store(video); // video as reference
      notifications.notify(video.getUser()); // video has acess to user so passing it there.
    }
}


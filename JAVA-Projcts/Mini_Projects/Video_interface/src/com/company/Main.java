package com.company;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        var processor = new VideoProcessor( new XVideoEncoder(),new SQLVideoDatabase(),new Notifications());
        processor.process(video);

        processor.process(video);

        /*

        Notifying john@domain.com...
Done!

Encoding video...
Done!

Storing video metadata in a SQL database...
Title: Jennifer's birthday
File Name: birthday.mp4
Done!

Notifying john@domain.com...
Done!


Process finished with exit code 0

         */
    }
}

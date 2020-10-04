package com.company;

public class XVideoEncoder implements VideoEncoder {
    @Override
    public void encode(Video video) { // passing video encoder here.
        // passing video as a reference

        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}

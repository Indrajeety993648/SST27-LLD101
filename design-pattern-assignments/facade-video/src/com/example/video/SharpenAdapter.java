package com.example.video;

public class SharpenAdapter {
    private final LegacySharpen legacy;

    public SharpenAdapter(LegacySharpen legacy) {
        this.legacy = legacy;
    }

    public Frame[] sharpen(Frame[] frames, int strength) {
        String handle = framesToHandle(frames);
        String newHandle = legacy.applySharpen(handle, strength);
        return handleToFrames(newHandle, frames);
    }

    private String framesToHandle(Frame[] frames) {
        return "HANDLE";
    }

    private Frame[] handleToFrames(String handle, Frame[] original) {
        return original;
    }
}

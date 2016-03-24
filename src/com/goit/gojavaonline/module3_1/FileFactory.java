package com.goit.gojavaonline.module3_1;

public class FileFactory {
    public static TextFile createTextFile(String name){
        return new TextFile(name);
    }

    public static AudioFile createAudioFile(String name){
        return new AudioFile(name);
    }

    public static GraphicFile createGraphicFile(String name){
        return new GraphicFile(name);
    }
}

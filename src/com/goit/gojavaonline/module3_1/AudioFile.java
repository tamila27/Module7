package com.goit.gojavaonline.module3_1;

public class AudioFile extends File {
    AudioFile(String name){
        super(name);
        System.out.println("Audio "+name+" file was successfully created");
    }

    @Override
    public void write(Object object){
        System.out.println("Audio recording to file "+ getName() +" has been successful.");
    }

    @Override
    public Object read(){
        Object object = new Object();
        System.out.println("Reading audio from file "+ getName() +"has been successful.");
        return object;
    }
}

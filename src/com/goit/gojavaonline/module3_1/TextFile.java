package com.goit.gojavaonline.module3_1;

public class TextFile extends File {

    TextFile(String name){
        super(name);
        System.out.println("Text "+name+" file was successfully created");
    }

    @Override
    public void write(Object object){
        System.out.println("Text has been successfully saved in the file " + getName());
    }

    @Override
    public Object read(){
        Object object = new Object();
        System.out.println("Text has been successfully read from the file " + getName());
        return object;
    }
}

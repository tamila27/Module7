package com.goit.gojavaonline.module3_1;

public class GraphicFile extends File {
    GraphicFile(String name){
        super(name);
        System.out.println("Graphic "+name+" file was successfully created");
    }

    @Override
    public void write(Object object){
        System.out.println("Picture has been successfully saved to the file " + getName());
    }

    @Override
    public Object read(){
        Object object = new Object();
        System.out.println("Picture has beed successfully read from file " + getName());
        return object;
    }
}

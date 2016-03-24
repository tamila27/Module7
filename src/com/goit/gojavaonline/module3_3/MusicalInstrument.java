package com.goit.gojavaonline.module3_3;

import com.goit.gojavaonline.Printable;

public abstract class MusicalInstrument implements Printable {
    private int id;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String print(){
        return getMusicalInstrumentName().name();
    }
    public abstract MusicalInstruments getMusicalInstrumentName();
}

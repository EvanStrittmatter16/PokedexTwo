package com.example.pokedextwo;

import java.util.ArrayList;

public class pokemon {
    private String name;
    private String description;
    private int imageResourceID;


    public static final pokemon[] poks = {
            new pokemon("charmander", "blah",
                    R.drawable.charizard),
            new pokemon("charmeleon", "blah",
                    R.drawable.charizard),
            new pokemon("charizard", "blah",
                   R.drawable.charizard)
    };
    private pokemon(String name, String description, int imageResourceID){
        this.name=name;
        this.description=description;
        this.imageResourceID=imageResourceID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

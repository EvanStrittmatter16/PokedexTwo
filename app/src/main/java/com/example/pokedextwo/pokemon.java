package com.example.pokedextwo;

public class pokemon {
    private String name;
    private String description;
    private int imageResourceID;


    public static final pokemon[] drinks = {
            new pokemon("pokemon1", "blah",
                    R.drawable.charizard),
//            new pokemon("pokemon2", "blah",
//                    R.drawable.cappuccino),
//            new pokemon("pokemon3", "blah",
//                    R.drawable.filter)
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

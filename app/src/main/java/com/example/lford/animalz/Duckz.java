package com.example.lford.animalz;

public class Duckz extends Animalz implements Animalz.Funz {

    @Override
    public String Sayz() {
        return("Got any grapes?");
    }
    public Duckz(){

    }

    @Override
    public String Playz() {
        return ("A duck walked up to a lemonade stand");
    }
}

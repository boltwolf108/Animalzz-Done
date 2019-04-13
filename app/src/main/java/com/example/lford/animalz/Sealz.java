package com.example.lford.animalz;

public class Sealz extends Animalz implements Animalz.Funz {
    @Override
    public String Sayz() {
        return("RREEEEEEEE!!!");
    }

    public Sealz(){

    }

    @Override
    public String Playz() {
        return("The seal steals a child's new pet goldfish");
    }
}

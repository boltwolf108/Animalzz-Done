package com.example.lford.animalz;

public class Sealz extends Animalz implements Animalz.Funz {
    @Override
    public String Sayz() {
        return("ow ow ow");
    }

    public Sealz(){

    }

    @Override
    public String Playz() {
        return("The seal bounces a ball off its nose.");
    }
}

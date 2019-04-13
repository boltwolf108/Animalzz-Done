package com.example.lford.animalz;

import java.util.ArrayList;
import java.util.Random;

public class Foxz extends Animalz implements Animalz.Funz {

    @Override
    public String Sayz() {
        ArrayList<String> Sayingsz = new ArrayList<>();
        Sayingsz.add("OH MAN!");
        Sayingsz.add("Leave the flying to me!");
        Sayingsz.add("It's called a hustle, sweetheart.");
        Sayingsz.add("You scared the cuss out of us!");
        Sayingsz.add("Where's my bandit hat!");
        Sayingsz.add("Oh no sir, we prefer doing things our own way.");
        Random x = new Random();
        int y = x.nextInt(6);
        return(Sayingsz.get(y));
    }


    public Foxz(){

    }


    @Override
    public String Playz() {
        return ("The fox likes to where bandanas and swipe from children.");
    }
}

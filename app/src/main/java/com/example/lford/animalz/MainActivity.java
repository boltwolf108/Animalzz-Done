package com.example.lford.animalz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView output;
    ArrayList<Animalz> animalsz = new ArrayList<>();
    Duckz duck = new Duckz();
    Fishz fish = new Fishz();
    Sealz seal = new Sealz();
    Foxz fox = new Foxz();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView) findViewById(R.id.output);
        animalsz.add(fish);
        animalsz.add(duck);
        animalsz.add(seal);
        animalsz.add(fox);

        for(Animalz printanimals : animalsz){
            this.output.append("\n" + printanimals.getClass().getSimpleName() + " goes " + printanimals.Sayz());
            if (printanimals instanceof Sealz) {
                this.output.append("\n" + ((Sealz)printanimals).Playz());
            }
            if (printanimals instanceof Foxz) {
                this.output.append("\n" + ((Foxz)printanimals).Playz());
            }
        }
    }
}

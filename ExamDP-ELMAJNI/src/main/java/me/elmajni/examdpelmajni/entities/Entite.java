package me.elmajni.examdpelmajni.entities;


import me.elmajni.examdpelmajni.aspects.Log;
import me.elmajni.examdpelmajni.design_patterns.Observable;
import me.elmajni.examdpelmajni.design_patterns.Observer;
import org.springframework.stereotype.Component;

@Component
public class Entite  implements Observer {
    protected String nom;
    protected int level;

    public Entite(String nom) {
        this.nom = nom;
    }

    @Log
    @Override
    public void update(Observable o) {

    }
}

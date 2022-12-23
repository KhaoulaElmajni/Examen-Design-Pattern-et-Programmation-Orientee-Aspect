package me.elmajni.examdpelmajni.entities;

import me.elmajni.examdpelmajni.design_patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class EntiteSource extends Classe{

    private List<Cardinalite> cardinalites = new ArrayList<>();

    public EntiteSource(String nom) {
        super(nom);
    }

    public EntiteSource(String nom, List<Attribut> attributs, List<Methode> methodes, List<Constructeur> constructeurs, List<Observer> observers) {
        super(nom, attributs, methodes, constructeurs, observers);
    }
}

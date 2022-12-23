package me.elmajni.examdpelmajni.entities;

import me.elmajni.examdpelmajni.aspects.Log;
import me.elmajni.examdpelmajni.design_patterns.Observable;
import me.elmajni.examdpelmajni.design_patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Classe extends Entite implements Observable {

    private List<Attribut> attributs =new ArrayList<>();
    private List<Methode> methodes = new ArrayList<>();
    private List<Constructeur> constructeurs = new ArrayList<>();
    private ClassVisibilite visibilite;

    private Cardinalite[] cardinalites = new Cardinalite[2];

    private List<Observer> observers = new ArrayList<>();

    public Classe(String nom) {
        super(nom);
    }

    public Classe(String nom,
                  List<Attribut> attributs,
                  List<Methode> methodes,
                  List<Constructeur> constructeurs,
                  List<Observer> observers,
                  ClassVisibilite visibilite) {
        super(nom);
        this.attributs = attributs;
        this.methodes = methodes;
        this.constructeurs = constructeurs;
        this.observers = observers;
        this.visibilite = visibilite;
    }

    @Override
    @Log
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Log
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Log
    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(this);
        }
    }

}

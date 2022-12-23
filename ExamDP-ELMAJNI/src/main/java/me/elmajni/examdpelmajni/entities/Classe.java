package me.elmajni.examdpelmajni.entities;

import me.elmajni.examdpelmajni.aspects.Log;
import me.elmajni.examdpelmajni.design_patterns.Observable;
import me.elmajni.examdpelmajni.design_patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Classe extends Entite implements Observable {

    List<Attribut> attributs =new ArrayList<>();
    List<Methode> methodes = new ArrayList<>();
    List<Constructeur> constructeurs = new ArrayList<>();


    List<Observer> observers = new ArrayList<>();

    public Classe(String nom) {
        super(nom);
    }

    public Classe(String nom, List<Attribut> attributs, List<Methode> methodes, List<Constructeur> constructeurs, List<Observer> observers) {
        super(nom);
        this.attributs = attributs;
        this.methodes = methodes;
        this.constructeurs = constructeurs;
        this.observers = observers;
    }

    @Override
    @Log
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(this);
        }
    }

}

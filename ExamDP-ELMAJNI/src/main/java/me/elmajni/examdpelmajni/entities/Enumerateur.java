package me.elmajni.examdpelmajni.entities;

import java.util.ArrayList;
import java.util.List;

public class Enumerateur extends Entite{
    List<Valeur> valeurs = new ArrayList<>();


    public Enumerateur(String nom) {
        super(nom);
    }
}

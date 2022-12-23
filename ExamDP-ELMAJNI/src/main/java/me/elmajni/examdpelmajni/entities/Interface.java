package me.elmajni.examdpelmajni.entities;

import java.util.ArrayList;
import java.util.List;

public class Interface extends Entite{

    List<MethodeAbstraite> methodeAbstraites = new ArrayList<>();

    public Interface(String nom) {
        super(nom);
    }
}

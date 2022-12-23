package me.elmajni.examdpelmajni.entities;

import me.elmajni.examdpelmajni.aspects.Log;

public class Parametre {
    private String nom;
    private Type type;

    public Parametre() {
    }
    public Parametre(String nom, Type type) {
        this.nom = nom;
        this.type = type;
    }

    @Log
    public String getNom() {
        return nom;
    }

    @Log
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Log
    public Type getType() {
        return type;
    }

    @Log
    public void setType(Type type) {
        this.type = type;
    }
}

package me.elmajni.examdpelmajni.entities;

import me.elmajni.examdpelmajni.aspects.Log;

import java.util.ArrayList;
import java.util.List;

public class Methode {

    private String typeRetour;
    private Visibilite visibilite;
    private String nom;
    private List<Parametre> parametres =  new ArrayList<>();

    private boolean isAbstract;
    private boolean isStatic;
    private boolean isFinal;

    @Log
    public boolean isAbstract() {
        return isAbstract;
    }

    @Log
    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    @Log
    public boolean isStatic() {
        return isStatic;
    }

    @Log
    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    @Log
    public boolean isFinal() {
        return isFinal;
    }

    @Log
    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    @Log
    public List<Parametre> getParametres() {
        return parametres;
    }

    @Log
    public void setParametres(List<Parametre> parametres) {
        this.parametres = parametres;
    }


    @Log
    public String getTypeRetour() {
        return typeRetour;
    }

    @Log
    public void setTypeRetour(String typeRetour) {
        this.typeRetour = typeRetour;
    }

    @Log
    public Visibilite getVisibilite() {
        return visibilite;
    }

    @Log
    public void setVisibilite(Visibilite visibilite) {
        this.visibilite = visibilite;
    }

    @Log
    public String getNom() {
        return nom;
    }

    @Log
    public void setNom(String nom) {
        this.nom = nom;
    }
}

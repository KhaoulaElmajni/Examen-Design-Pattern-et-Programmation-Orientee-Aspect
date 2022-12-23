package me.elmajni.examdpelmajni.entities;

import me.elmajni.examdpelmajni.aspects.Log;

public class Attribut {

    private String nom;
    private Type type;
    private Visibilite visibilite;
    private boolean isStatique;
    private boolean isFinal;

    public Attribut() {
    }

    public Attribut(String nom,
                    Type type,
                    Visibilite visibilite,
                    boolean isStatique,
                    boolean isFinal) {
        this.nom = nom;
        this.type = type;
        this.visibilite = visibilite;
        this.isStatique = isStatique;
        this.isFinal = isFinal;
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

    @Log
    public Visibilite getVisibilite() {
        return visibilite;
    }

    @Log
    public void setVisibilite(Visibilite visibilite) {
        this.visibilite = visibilite;
    }

    @Log
    public boolean isStatique() {
        return isStatique;
    }

    @Log
    public void setStatique(boolean statique) {
        this.isStatique = statique;
    }

    @Log
    public boolean isFinal() {
        return isFinal;
    }

    @Log
    public void setFinal(boolean aFinal) {
        this.isFinal = aFinal;
    }
}

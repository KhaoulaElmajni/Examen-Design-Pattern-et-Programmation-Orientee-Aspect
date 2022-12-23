package me.elmajni.examdpelmajni.entities;

public class Propriete extends Entite {

    private String type;
    private String valeur;


    public Propriete(String nom) {
        super(nom);
    }

    public Propriete(String nom, String type, String valeur) {
        super(nom);
        this.type = type;
        this.valeur = valeur;
    }
}

package me.elmajni.examdpelmajni.entities;

public class Attribut {

    private String nom;
    private AttributType type;
    private AttributVisibilite visibilite;
    private boolean isStatique;
    private boolean isFinal;

    public Attribut() {
    }

    public Attribut(String nom,
                    AttributType type,
                    AttributVisibilite visibilite,
                    boolean isStatique,
                    boolean isFinal) {
        this.nom = nom;
        this.type = type;
        this.visibilite = visibilite;
        this.isStatique = isStatique;
        this.isFinal = isFinal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public AttributType getType() {
        return type;
    }

    public void setType(AttributType type) {
        this.type = type;
    }

    public AttributVisibilite getVisibilite() {
        return visibilite;
    }

    public void setVisibilite(AttributVisibilite visibilite) {
        this.visibilite = visibilite;
    }

    public boolean isStatique() {
        return isStatique;
    }

    public void setStatique(boolean statique) {
        this.isStatique = statique;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        this.isFinal = aFinal;
    }
}

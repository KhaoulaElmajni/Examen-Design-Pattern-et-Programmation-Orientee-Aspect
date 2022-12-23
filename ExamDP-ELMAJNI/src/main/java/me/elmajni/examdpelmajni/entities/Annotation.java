package me.elmajni.examdpelmajni.entities;

import java.util.ArrayList;
import java.util.List;

public class Annotation extends Entite{

    List<Propriete> proprietes = new ArrayList<>();


    public Annotation(String name) {
        super(name);
    }


    public List<Propriete> getProperties() {
        return proprietes;
    }

    public void setProperties(List<Propriete> properties) {
        this.proprietes = properties;
    }

    public void addProperty(Propriete property) {
        proprietes.add(property);
    }

    public void removeProperty(Propriete property) {
        proprietes.remove(property);
    }


}

package me.elmajni.examdpelmajni.entities;

import me.elmajni.examdpelmajni.aspects.Log;

import java.util.ArrayList;
import java.util.List;

public class Annotation extends Entite{

    private List<Propriete> proprietes = new ArrayList<>();


    public Annotation(String name) {
        super(name);
    }

    @Log
    public List<Propriete> getProperties() {
        return proprietes;
    }

    public void setProperties(List<Propriete> properties) {
        this.proprietes = properties;
    }

    @Log
    public void addProperty(Propriete property) {
        proprietes.add(property);
    }

    @Log
    public void removeProperty(Propriete property) {
        proprietes.remove(property);
    }


}

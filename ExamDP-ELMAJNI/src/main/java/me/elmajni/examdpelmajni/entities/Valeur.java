package me.elmajni.examdpelmajni.entities;

import me.elmajni.examdpelmajni.aspects.Log;

public class Valeur {
    private String name;

    public Valeur() {
    }
    public Valeur(String name) {
        this.name = name;
    }
    @Log
    public String getName() {
        return name;
    }
    @Log
    public void setName(String name) {
        this.name = name;
    }
}

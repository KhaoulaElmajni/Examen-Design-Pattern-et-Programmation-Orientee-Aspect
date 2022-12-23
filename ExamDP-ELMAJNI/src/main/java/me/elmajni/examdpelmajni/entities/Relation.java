package me.elmajni.examdpelmajni.entities;

public abstract class Relation {
    protected String name;
    public Relation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

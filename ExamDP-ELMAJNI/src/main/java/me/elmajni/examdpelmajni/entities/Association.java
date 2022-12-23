package me.elmajni.examdpelmajni.entities;

import me.elmajni.examdpelmajni.aspects.Log;

public abstract class Association extends Relation{

    private Classe entiteSrc;
    private Classe entiteDst;

    @Log
    public Classe getEntiteSrc() {
        return entiteSrc;
    }

    @Log
    public void setEntiteSrc(Classe entiteSrc) {
        this.entiteSrc = entiteSrc;
    }

    @Log
    public Classe getEntiteDst() {
        return entiteDst;
    }

    @Log
    public void setEntiteDst(Classe entiteDst) {
        this.entiteDst = entiteDst;
    }

    public Association(String name) {
        super(name);
    }

    public Association(Classe entiteSrc, Classe entiteDst) {
        super("Association");
        this.entiteSrc = entiteSrc;
        this.entiteDst = entiteDst;
    }
}

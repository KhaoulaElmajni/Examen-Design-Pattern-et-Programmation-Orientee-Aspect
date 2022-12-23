package me.elmajni.examdpelmajni.entities;

public abstract class Association extends Relation{

    private EntiteSource entiteSrc;
    private EntiteDestination entiteDst;

    public EntiteSource getEntiteSrc() {
        return entiteSrc;
    }

    public void setEntiteSrc(EntiteSource entiteSrc) {
        this.entiteSrc = entiteSrc;
    }

    public EntiteDestination getEntiteDst() {
        return entiteDst;
    }

    public void setEntiteDst(EntiteDestination entiteDst) {
        this.entiteDst = entiteDst;
    }

    public Association(String name) {
        super(name);
    }

    public Association(EntiteSource entiteSrc, EntiteDestination entiteDst) {
        super("Association");
        this.entiteSrc = entiteSrc;
        this.entiteDst = entiteDst;
    }
}

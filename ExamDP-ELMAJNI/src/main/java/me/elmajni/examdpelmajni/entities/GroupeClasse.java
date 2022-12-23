package me.elmajni.examdpelmajni.entities;

import me.elmajni.examdpelmajni.aspects.Log;

import java.util.ArrayList;
import java.util.List;

public class GroupeClasse extends Entite{

    private List<Entite> children = new ArrayList<>();


    public GroupeClasse(String nom) {
        super(nom);
    }

    public Entite add(Entite c){
        c.level=this.level+1;
        children.add(c);
        return c;
    }

    /*public void show() {
        System.out.println(tab()+"Nom Entite :"+nom);
        for(Entite c:children){
            c.show();
        }
    }*/
}

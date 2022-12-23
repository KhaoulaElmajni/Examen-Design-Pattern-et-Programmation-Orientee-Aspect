package me.elmajni.examdpelmajni.entities;


import me.elmajni.examdpelmajni.design_patterns.Observable;
import me.elmajni.examdpelmajni.design_patterns.Observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable o) {
        //int nouvelEtat = ((ObservableImpl1)o).getEtat();
        //System.out.println("observers.Observer 1 etat:"+nouvelEtat);
    }
}

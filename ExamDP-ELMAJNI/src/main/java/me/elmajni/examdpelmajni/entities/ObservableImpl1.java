package me.elmajni.examdpelmajni.entities;

import me.elmajni.examdpelmajni.design_patterns.Observable;
import me.elmajni.examdpelmajni.design_patterns.Observer;

import java.util.List;

public class ObservableImpl1 implements Observable {

    private List<Observer> observers;
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(this);
        }
    }
}

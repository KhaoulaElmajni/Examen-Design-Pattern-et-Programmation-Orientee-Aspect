package me.elmajni.examdpelmajni.entities;

import me.elmajni.examdpelmajni.aspects.Log;
import me.elmajni.examdpelmajni.design_patterns.Observable;
import me.elmajni.examdpelmajni.design_patterns.Observer;

import java.util.List;

public class ObservableImpl1 implements Observable {

    private List<Observer> observers;

    @Log
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Log
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Log
    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(this);
        }
    }
}

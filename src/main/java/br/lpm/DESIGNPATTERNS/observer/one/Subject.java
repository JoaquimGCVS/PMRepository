package br.lpm.DESIGNPATTERNS.observer.one;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers;
    private String state;
    public Subject(String state) {
        observers = new ArrayList<>();
        setState(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public List<Observer> getObservers() {
        return observers;
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.getState());
        }
    }
}

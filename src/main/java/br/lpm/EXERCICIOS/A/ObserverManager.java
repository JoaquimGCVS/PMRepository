package br.lpm.EXERCICIOS.A;

import java.util.ArrayList;
import java.util.List;

public class ObserverManager implements Subject{
    private final List<Observer> observers;
    public ObserverManager () {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Order order) {
        for (Observer observer : observers) {
            observer.update(order);
        }
    }
}

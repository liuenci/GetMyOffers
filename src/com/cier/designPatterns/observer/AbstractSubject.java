package com.cier.designPatterns.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject{
    private Vector<Observer> vector = new Vector<>();
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
             enumeration.nextElement().update();
        }
    }
}

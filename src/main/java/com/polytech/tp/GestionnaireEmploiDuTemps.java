package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;


public class GestionnaireEmploiDuTemps implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String dernierChangement;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("Observer attaché."); // Log optionnel
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer détaché."); // Log optionnel
    }

    @Override
    public void notifyObservers(String message) {
        System.out.println("Notification de changement envoyée : " + message); // Log optionnel
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

  
    public void setChangement(String changement) {
        this.dernierChangement = changement;
        notifyObservers(changement);
    }
}
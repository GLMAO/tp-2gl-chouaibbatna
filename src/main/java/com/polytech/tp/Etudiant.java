package com.polytech.tp;


public class Etudiant implements Observer {
    private String nom;

    public Etudiant(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        System.out.println("Etudiant " + nom + " notifié : " + message);
    }
}
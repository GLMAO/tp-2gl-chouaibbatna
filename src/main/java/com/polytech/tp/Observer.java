package com.polytech.tp;

public interface Observer {
    /**
     * Méthode appelée par le Subject pour notifier l'Observer.
     * @param message Le message de changement.
     */
    void update(String message);
}
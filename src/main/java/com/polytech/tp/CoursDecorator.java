package com.polytech.tp;


public abstract class CoursDecorator implements ICours {
    protected ICours coursDecore;

    public CoursDecorator(ICours coursDecore) {
        this.coursDecore = coursDecore;
    }
    // TODO: Forcer l'implementation des méthodes de ICours
    @Override
    public String getDescription() {
        return coursDecore.getDescription();
    }
}
package com.polytech.tp;


public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours coursDecore) {
        super(coursDecore);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (En ligne)";
    }
}
package edu.design_patterns.decorator.starbuzz.components;

public class Espresso extends Beverage {

    public Espresso() {
        recalculateCost();
        description = "Espresso";
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    protected void recalculateCost() {
        switch (getSize()) {
            case LARGE -> cost = 175.0;
            case MEDIUM -> cost = 140.0;
            case SMALL -> cost = 105.0;
        }
    }
}

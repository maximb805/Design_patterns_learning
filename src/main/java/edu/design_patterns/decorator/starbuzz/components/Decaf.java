package edu.design_patterns.decorator.starbuzz.components;

public class Decaf extends Beverage {

    public Decaf() {
        recalculateCost();
        description = "Decaf coffee";
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    protected void recalculateCost() {
        switch (getSize()) {
            case LARGE -> cost = 200.0;
            case MEDIUM -> cost = 160.0;
            case SMALL -> cost = 120.0;
        }
    }
}

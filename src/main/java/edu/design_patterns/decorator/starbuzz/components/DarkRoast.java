package edu.design_patterns.decorator.starbuzz.components;


public class DarkRoast extends Beverage {

    public DarkRoast() {
        recalculateCost();
        description = "Dark Roast coffee";
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    protected void recalculateCost() {
        switch (getSize()) {
            case LARGE -> cost = 190.0;
            case MEDIUM -> cost = 150.0;
            case SMALL -> cost = 110.0;
        }
    }
}

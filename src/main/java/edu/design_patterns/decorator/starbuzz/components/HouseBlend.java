package edu.design_patterns.decorator.starbuzz.components;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        recalculateCost();
        description = "House Blend coffee";
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    protected void recalculateCost() {
        switch (getSize()) {
            case LARGE -> cost = 170.0;
            case MEDIUM -> cost = 130.0;
            case SMALL -> cost = 90.0;
        }
    }
}

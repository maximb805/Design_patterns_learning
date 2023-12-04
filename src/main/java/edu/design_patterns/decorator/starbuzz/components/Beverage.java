package edu.design_patterns.decorator.starbuzz.components;

public abstract class Beverage {

    protected String description = "Unknown beverage";
    protected CoffeeSize size = CoffeeSize.MEDIUM;
    protected double cost;

    public String getDescription() {
        return size + " " + description;
    }

    public abstract double cost();
    protected abstract void recalculateCost();

    public CoffeeSize getSize() {
        return size;
    }

    public void setSize(CoffeeSize size) {
        this.size = size;
        recalculateCost();
    }
}

package edu.design_patterns.decorator.starbuzz.decorators;

import edu.design_patterns.decorator.starbuzz.components.Beverage;
import edu.design_patterns.decorator.starbuzz.components.CoffeeSize;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();
    public abstract CoffeeSize getSize();
    public abstract void setSize(CoffeeSize coffeeSize);
}

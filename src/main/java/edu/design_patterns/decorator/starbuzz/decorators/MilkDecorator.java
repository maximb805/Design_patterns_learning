package edu.design_patterns.decorator.starbuzz.decorators;

import edu.design_patterns.decorator.starbuzz.components.Beverage;
import edu.design_patterns.decorator.starbuzz.components.CoffeeSize;

public class MilkDecorator extends CondimentDecorator {

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
        recalculateCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + cost;
    }

    @Override
    public CoffeeSize getSize() {
        return beverage.getSize();
    }

    @Override
    public void setSize(CoffeeSize coffeeSize) {
        beverage.setSize(coffeeSize);
        recalculateCost();
    }

    @Override
    protected void recalculateCost() {
        switch (beverage.getSize()) {
            case LARGE -> cost = 5.0;
            case MEDIUM -> cost = 3.0;
            case SMALL -> cost = 1.0;
        }
    }
}

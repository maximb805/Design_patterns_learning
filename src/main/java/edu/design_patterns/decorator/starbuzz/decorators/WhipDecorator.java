package edu.design_patterns.decorator.starbuzz.decorators;

import edu.design_patterns.decorator.starbuzz.components.Beverage;
import edu.design_patterns.decorator.starbuzz.components.CoffeeSize;

public class WhipDecorator extends CondimentDecorator {

    public WhipDecorator(Beverage beverage) {
        this.beverage = beverage;
        recalculateCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
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
            case LARGE -> cost = 15.0;
            case MEDIUM -> cost = 10.0;
            case SMALL -> cost = 5.0;
        }
    }
}

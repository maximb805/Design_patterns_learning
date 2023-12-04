package edu.design_patterns.decorator.starbuzz;

import edu.design_patterns.decorator.starbuzz.components.Beverage;
import edu.design_patterns.decorator.starbuzz.components.CoffeeSize;
import edu.design_patterns.decorator.starbuzz.components.DarkRoast;
import edu.design_patterns.decorator.starbuzz.decorators.*;

public class Starbuzz {
    public static void main(String[] args) {
        Beverage dark = new DarkRoast();

        dark = new MochaDecorator(dark);
        dark = new MilkDecorator(dark);
        dark = new SoyDecorator(dark);
        dark.setSize(CoffeeSize.LARGE);
        dark = new WhipDecorator(dark);
        dark = new WhipDecorator(dark);



        System.out.println(dark.getDescription() + " ₽" + dark.cost());
    }
}

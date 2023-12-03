package edu.design_patterns.strategy.sim_u_duck;

import edu.design_patterns.strategy.sim_u_duck.aspects.FlyRocketPower;
import edu.design_patterns.strategy.sim_u_duck.ducks.*;


import java.util.Arrays;
import java.util.List;

public class SimUDuck {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();

        List<Duck> ducks = Arrays.stream(
                new Duck[]{mallardDuck, redHeadDuck, rubberDuck, woodenDuck}
        ).toList();

        System.out.println("Displaying Ducks:");
        ducks.forEach(Duck::display);

        System.out.println("\nDucks swimming:");
        ducks.forEach(Duck::swim);

        System.out.println("\nDucks quacking:");
        ducks.forEach(d -> {
            System.out.print(d.getDuckName() + " duck: ");
            d.performQuack();
        });

        System.out.println("\nDucks flying:");
        ducks.forEach(d -> {
            System.out.print(d.getDuckName() + " duck ");
            d.performFly();
        });
        System.out.println("\n");

        woodenDuck.setFlyBehavior(new FlyRocketPower());
        System.out.print(woodenDuck.getDuckName() + " duck ");
        woodenDuck.performFly();
    }
}

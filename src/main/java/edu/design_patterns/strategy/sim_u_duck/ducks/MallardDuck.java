package edu.design_patterns.strategy.sim_u_duck.ducks;

import edu.design_patterns.strategy.sim_u_duck.aspects.DefaultQuack;
import edu.design_patterns.strategy.sim_u_duck.aspects.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new DefaultQuack();
        flyBehavior = new FlyWithWings();
        duckName = "Mallard";
    }
}

package edu.design_patterns.strategy.sim_u_duck.ducks;

import edu.design_patterns.strategy.sim_u_duck.aspects.DefaultQuack;
import edu.design_patterns.strategy.sim_u_duck.aspects.FlyWithWings;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehavior = new DefaultQuack();
        flyBehavior = new FlyWithWings();
        duckName = "Red Head";
    }
}

package edu.design_patterns.strategy.sim_u_duck.ducks;

import edu.design_patterns.strategy.sim_u_duck.aspects.FlyNoWay;
import edu.design_patterns.strategy.sim_u_duck.aspects.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
        duckName = "Rubber";
    }
}

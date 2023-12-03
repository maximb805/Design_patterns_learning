package edu.design_patterns.strategy.sim_u_duck.ducks;

import edu.design_patterns.strategy.sim_u_duck.aspects.FlyNoWay;
import edu.design_patterns.strategy.sim_u_duck.aspects.MuteQuack;

public class WoodenDuck extends Duck {

    public WoodenDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
        duckName = "Wooden";
    }
}

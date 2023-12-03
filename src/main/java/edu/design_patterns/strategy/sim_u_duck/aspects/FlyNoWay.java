package edu.design_patterns.strategy.sim_u_duck.aspects;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("can't fly :(");
    }
}

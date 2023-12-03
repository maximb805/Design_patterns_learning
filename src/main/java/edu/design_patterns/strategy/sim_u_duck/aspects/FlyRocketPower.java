package edu.design_patterns.strategy.sim_u_duck.aspects;

public class FlyRocketPower implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("flying like a rocket!");
    }
}

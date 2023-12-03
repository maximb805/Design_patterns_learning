package edu.design_patterns.strategy.sim_u_duck.aspects;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("...");
    }
}

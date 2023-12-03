package edu.design_patterns.strategy.sim_u_duck.aspects;

public class DefaultQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}

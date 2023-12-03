package edu.design_patterns.strategy.sim_u_duck.ducks;

import edu.design_patterns.strategy.sim_u_duck.aspects.FlyBehavior;
import edu.design_patterns.strategy.sim_u_duck.aspects.QuackBehavior;

public abstract class Duck {

    protected String duckName;
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void display() {
        System.out.println("Displaying " + duckName + " duck");
    }

    public void swim() {
        System.out.println(duckName + " duck swimming");
    }

    public void performFly() {
        if (flyBehavior != null)
            flyBehavior.fly();
    }

    public void performQuack() {
        if (quackBehavior != null)
            quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public String getDuckName() {
        return duckName;
    }
}

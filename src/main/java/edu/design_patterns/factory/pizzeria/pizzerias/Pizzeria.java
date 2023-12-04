package edu.design_patterns.factory.pizzeria.pizzerias;

import edu.design_patterns.factory.pizzeria.simple_factoriy.SimplePizzaFactory;
import edu.design_patterns.factory.pizzeria.pizzas.Pizza;
import edu.design_patterns.factory.pizzeria.pizzas.PizzaType;

public abstract class Pizzeria {

//    protected SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();

    public Pizza orderPizza(PizzaType pizzaType) {
//        Pizza pizza = pizzaFactory.createPizza(pizzaType); Это пример использования простой фабрики
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // Данный метод действует как фабрика
    // (так как тип пиццы будет зависеть от изначально созданной пиццерии)
    public abstract Pizza createPizza(PizzaType pizzaType);

}

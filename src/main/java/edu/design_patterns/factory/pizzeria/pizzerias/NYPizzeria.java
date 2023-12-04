package edu.design_patterns.factory.pizzeria.pizzerias;

import edu.design_patterns.factory.pizzeria.ingredients.NYPizzaIngredientFactory;
import edu.design_patterns.factory.pizzeria.pizzas.*;

public class NYPizzeria extends Pizzeria {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        NYPizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        switch (pizzaType) {
            case CHEESE -> {
                pizza = new CheesePizza(factory);
                pizza.setName("Cheese pizza in NY style");
            }
            case VEGGIE -> {
                pizza = new VeggiePizza(factory);
                pizza.setName("Veggie pizza in NY style");
            }
            case MUSHROOM -> {
                pizza = new MushroomPizza(factory);
                pizza.setName("Mushroom pizza in NY style");
            }
            case PEPPERONI -> {
                pizza = new PepperoniPizza(factory);
                pizza.setName("Pepperoni pizza in NY style");
            }
        }
        return pizza;
    }
}

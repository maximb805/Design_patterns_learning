package edu.design_patterns.factory.pizzeria.pizzerias;

import edu.design_patterns.factory.pizzeria.ingredients.CaliforniaPizzaIngredientFactory;
import edu.design_patterns.factory.pizzeria.pizzas.*;

public class CaliforniaPizzeria extends Pizzeria {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        CaliforniaPizzaIngredientFactory factory = new CaliforniaPizzaIngredientFactory();
        switch (pizzaType) {
            case CHEESE -> {
                pizza = new CheesePizza(factory);
                pizza.setName("Cheese pizza in Californian style");
            }
            case VEGGIE -> {
                pizza = new VeggiePizza(factory);
                pizza.setName("Veggie pizza in Californian style");
            }
            case MUSHROOM -> {
                pizza = new MushroomPizza(factory);
                pizza.setName("Mushroom pizza in Californian style");
            }
            case PEPPERONI -> {
                pizza = new PepperoniPizza(factory);
                pizza.setName("Pepperoni pizza in Californian style");
            }
        }
        return pizza;
    }
}

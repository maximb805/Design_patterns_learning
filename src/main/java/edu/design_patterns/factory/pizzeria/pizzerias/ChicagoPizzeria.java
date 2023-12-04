package edu.design_patterns.factory.pizzeria.pizzerias;

import edu.design_patterns.factory.pizzeria.ingredients.ChicagoPizzaIngredientFactory;
import edu.design_patterns.factory.pizzeria.pizzas.*;

public class ChicagoPizzeria extends Pizzeria {

//    @Override
//    public Pizza createPizza(PizzaType pizzaType) {
//        switch (pizzaType) {
//            case CHEESE -> {
//                return new ChicagoStyleCheesePizza();
//            }
//            case VEGGIE -> {
//                return new ChicagoStyleVeggiePizza();
//            }
//            case MUSHROOM -> {
//                return new ChicagoStyleMushroomPizza();
//            }
//            case PEPPERONI -> {
//                return new ChicagoStylePepperoniPizza();
//            }
//            default -> {
//                return null;
//            }
//        }
//    }
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        ChicagoPizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
        switch (pizzaType) {
            case CHEESE -> {
                pizza = new CheesePizza(factory);
                pizza.setName("Cheese pizza in Chicago style");
            }
            case VEGGIE -> {
                pizza =  new VeggiePizza(factory);
                pizza.setName("Veggie pizza in Chicago style");
            }
            case MUSHROOM -> {
                pizza =  new MushroomPizza(factory);
                pizza.setName("Mushroom pizza in Chicago style");
            }
            case PEPPERONI -> {
                pizza =  new PepperoniPizza(factory);
                pizza.setName("Pepperoni pizza in Chicago style");
            }
        }
        return pizza;
    }
}

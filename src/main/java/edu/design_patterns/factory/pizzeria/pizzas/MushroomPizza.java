package edu.design_patterns.factory.pizzeria.pizzas;

import edu.design_patterns.factory.pizzeria.ingredients.PizzaIngredientFactory;

public class MushroomPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public MushroomPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        mushrooms = ingredientFactory.createMushrooms();
    }
}

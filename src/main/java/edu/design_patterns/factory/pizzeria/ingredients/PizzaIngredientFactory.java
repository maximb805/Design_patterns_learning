package edu.design_patterns.factory.pizzeria.ingredients;

import edu.design_patterns.factory.pizzeria.ingredients.cheeses.Cheese;
import edu.design_patterns.factory.pizzeria.ingredients.doughs.Dough;
import edu.design_patterns.factory.pizzeria.ingredients.mushrooms.Mushrooms;
import edu.design_patterns.factory.pizzeria.ingredients.pepperoni.Pepperoni;
import edu.design_patterns.factory.pizzeria.ingredients.sauces.Sauce;
import edu.design_patterns.factory.pizzeria.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Mushrooms createMushrooms();
}

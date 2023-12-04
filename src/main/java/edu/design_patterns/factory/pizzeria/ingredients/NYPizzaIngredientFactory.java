package edu.design_patterns.factory.pizzeria.ingredients;

import edu.design_patterns.factory.pizzeria.ingredients.cheeses.*;
import edu.design_patterns.factory.pizzeria.ingredients.doughs.*;
import edu.design_patterns.factory.pizzeria.ingredients.mushrooms.*;
import edu.design_patterns.factory.pizzeria.ingredients.pepperoni.*;
import edu.design_patterns.factory.pizzeria.ingredients.sauces.*;
import edu.design_patterns.factory.pizzeria.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Olives(), new Onion(), new Tomatoes()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SpicyPepperoni();
    }

    @Override
    public Mushrooms createMushrooms() {
        return new ButtonMushrooms();
    }
}

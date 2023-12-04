package edu.design_patterns.factory.pizzeria.ingredients;

import edu.design_patterns.factory.pizzeria.ingredients.cheeses.*;
import edu.design_patterns.factory.pizzeria.ingredients.doughs.*;
import edu.design_patterns.factory.pizzeria.ingredients.mushrooms.*;
import edu.design_patterns.factory.pizzeria.ingredients.pepperoni.*;
import edu.design_patterns.factory.pizzeria.ingredients.sauces.*;
import edu.design_patterns.factory.pizzeria.ingredients.veggies.*;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new MediumCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Onion(), new BellPepper(), new Tomatoes(), new JalapenoPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new HotPepperoni();
    }

    @Override
    public Mushrooms createMushrooms() {
        return new CreminiMushrooms();
    }
}

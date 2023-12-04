package edu.design_patterns.factory.pizzeria.pizzas;

import edu.design_patterns.factory.pizzeria.ingredients.cheeses.Cheese;
import edu.design_patterns.factory.pizzeria.ingredients.doughs.Dough;
import edu.design_patterns.factory.pizzeria.ingredients.mushrooms.Mushrooms;
import edu.design_patterns.factory.pizzeria.ingredients.pepperoni.Pepperoni;
import edu.design_patterns.factory.pizzeria.ingredients.sauces.Sauce;
import edu.design_patterns.factory.pizzeria.ingredients.veggies.Veggies;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Mushrooms mushrooms;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking for 10 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza into triangles");
    }

    public void box() {
        System.out.println("Boxing in official Pizzeria box");
    }

    public String getName() {
        return name;
    }

    public void  setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String veggiesStr = veggies != null ? getVeggiesString() : "";
        String pepperoniStr = pepperoni != null ? "\n    " + pepperoni.getName() : "";
        String mushroomStr = mushrooms != null ? "\n    " + mushrooms.getName() : "";

        return name + "\n    " + dough.getName() +
                "\n    " + sauce.getName() +
                veggiesStr +
                "\n    " + cheese.getName() +
                pepperoniStr + mushroomStr;
    }

    private String getVeggiesString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n    Veggies:");
        for (Veggies v : veggies) {
            sb.append("\n        ");
            sb.append(v.getName());
        }
        return sb.toString();
    }
}

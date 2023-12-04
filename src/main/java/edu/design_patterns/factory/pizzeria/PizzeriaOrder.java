package edu.design_patterns.factory.pizzeria;

import edu.design_patterns.factory.pizzeria.pizzerias.CaliforniaPizzeria;
import edu.design_patterns.factory.pizzeria.pizzerias.ChicagoPizzeria;
import edu.design_patterns.factory.pizzeria.pizzerias.NYPizzeria;
import edu.design_patterns.factory.pizzeria.pizzas.Pizza;
import edu.design_patterns.factory.pizzeria.pizzas.PizzaType;
import edu.design_patterns.factory.pizzeria.pizzerias.Pizzeria;

public class PizzeriaOrder {
    public static void main(String[] args) {
        Pizzeria pizzeria1 = new ChicagoPizzeria();
        Pizza p1 = pizzeria1.orderPizza(PizzaType.MUSHROOM);
        System.out.println(p1);
        System.out.println();

        Pizzeria pizzeria2 = new NYPizzeria();
        Pizza p2 = pizzeria2.orderPizza(PizzaType.PEPPERONI);
        System.out.println(p2);
        System.out.println();

        Pizzeria pizzeria3 = new ChicagoPizzeria();
        Pizza p3 = pizzeria3.orderPizza(PizzaType.VEGGIE);
        System.out.println(p3);
        System.out.println();

        Pizzeria pizzeria4 = new CaliforniaPizzeria();
        Pizza p4 = pizzeria4.orderPizza(PizzaType.CHEESE);
        System.out.println(p4);
    }
}

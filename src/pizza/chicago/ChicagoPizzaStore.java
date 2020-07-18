package pizza.chicago;

import ingredients.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import pizza.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza pizza = null;
    PizzaIngredientFactory factory;

    public ChicagoPizzaStore() {
        this.factory = new ChicagoIngredientFactory();
    }

    @Override
    protected Pizza createPizza(String item) {

        switch (item) {
            case "CHEESE" -> {
                pizza = new CheesePizza(factory);
                pizza.name = "Chicago Style Cheese Pizza";
                pizza.bakeTime = 25;
            }
            case "PEPPERONI" -> {
                pizza = new PepperoniPizza(factory);
                pizza.name = "Chicago Style Pepperoni Pizza";
                pizza.bakeTime = 22;
            }
            case "VEGETARIAN" -> {
                pizza = new PepperoniPizza(factory);
                pizza.name = "Chicago Style Veggie Pizza";
                pizza.bakeTime = 23;
            }
        }

        return pizza;
    }
}

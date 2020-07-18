package pizza;

import ingredients.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza (PizzaIngredientFactory factory){
        this.pizzaIngredientFactory = factory;
    }

    @Override
    public void prepare() {
        cheese = pizzaIngredientFactory.create_cheese();
        clams = pizzaIngredientFactory.create_clams();
        dough = pizzaIngredientFactory.create_dough();
        pepperoni = pizzaIngredientFactory.create_pepperoni();
        veggies = pizzaIngredientFactory.create_veggies();
        sauce = pizzaIngredientFactory.create_sauce();
    }

    @Override
    public double getCost() {
        return 11.99;
    }


    /**
     * You can override parent methods here
     */
    @Override
    public void cut() {
        System.out.println("Override cutting of pizza");
    }
}

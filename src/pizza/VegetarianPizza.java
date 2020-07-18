package pizza;

import ingredients.PizzaIngredientFactory;

public class VegetarianPizza extends Pizza {
    PizzaIngredientFactory factory;

    public VegetarianPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        cheese = factory.create_cheese();
        clams = factory.create_clams();
        dough = factory.create_dough();
        pepperoni = factory.create_pepperoni();
        veggies = factory.create_veggies();
        sauce = factory.create_sauce();
    }

    @Override
    public double getCost() {
        return 12.99;
    }
}

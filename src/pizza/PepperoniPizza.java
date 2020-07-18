package pizza;

import ingredients.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory factory;

    public PepperoniPizza(PizzaIngredientFactory factory){
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
        return 9.99;
    }
}

package pizza.chicago;

import ingredients.PizzaIngredientFactory;
import ingredients.cheese.Cheese;
import ingredients.clams.Clams;
import ingredients.dough.Dough;
import ingredients.dough.ThickCrustDough;
import ingredients.pepperoni.Pepperoni;
import ingredients.sauce.Sauce;
import ingredients.veggies.Veggies;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough create_dough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese create_cheese() {
        return null;
    }

    @Override
    public Clams create_clams() {
        return null;
    }

    @Override
    public Pepperoni create_pepperoni() {
        return null;
    }

    @Override
    public Veggies[] create_veggies() {
        return new Veggies[0];
    }

    @Override
    public Sauce create_sauce() {
        return null;
    }
}

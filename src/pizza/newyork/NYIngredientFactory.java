package pizza.newyork;

import ingredients.PizzaIngredientFactory;
import ingredients.cheese.Cheese;
import ingredients.cheese.ReggianoCheese;
import ingredients.clams.Clams;
import ingredients.clams.FrozenClams;
import ingredients.dough.Dough;
import ingredients.dough.ThinCrustDough;
import ingredients.pepperoni.Pepperoni;
import ingredients.pepperoni.SlicedPepperoni;
import ingredients.sauce.PlumTomatoSauce;
import ingredients.sauce.Sauce;
import ingredients.veggies.BlackOlives;
import ingredients.veggies.Eggplant;
import ingredients.veggies.Spinach;
import ingredients.veggies.Veggies;

public class NYIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough create_dough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese create_cheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams create_clams() {
        return new FrozenClams();
    }

    @Override
    public Pepperoni create_pepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] create_veggies() {
        return new Veggies[]{new BlackOlives(), new Eggplant(), new Spinach()};
    }

    @Override
    public Sauce create_sauce() {
        return new PlumTomatoSauce();
    }
}

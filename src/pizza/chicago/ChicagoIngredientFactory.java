package pizza.chicago;

import ingredients.PizzaIngredientFactory;
import ingredients.cheese.Cheese;
import ingredients.cheese.MozzarellaCheese;
import ingredients.clams.Clams;
import ingredients.clams.FreshClams;
import ingredients.dough.Dough;
import ingredients.dough.ThickCrustDough;
import ingredients.pepperoni.Pepperoni;
import ingredients.pepperoni.SlicedPepperoni;
import ingredients.sauce.MarinaraSauce;
import ingredients.sauce.Sauce;
import ingredients.veggies.*;

import java.util.List;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough create_dough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese create_cheese() {

        return new MozzarellaCheese();
    }

    @Override
    public Clams create_clams() {
        return new FreshClams();
    }

    @Override
    public Pepperoni create_pepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] create_veggies() {

        return new Veggies[]{new Garlic(), new Mushrooms(), new Onion()};
    }

    @Override
    public Sauce create_sauce() {
        return new MarinaraSauce();
    }
}

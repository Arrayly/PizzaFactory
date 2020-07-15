package ingredients;

import ingredients.cheese.Cheese;
import ingredients.clams.Clams;
import ingredients.dough.Dough;
import ingredients.pepperoni.Pepperoni;
import ingredients.sauce.Sauce;
import ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough create_dough();
    public Cheese create_cheese();
    public Clams create_clams();
    public Pepperoni create_pepperoni();
    public Veggies[] create_veggies();
    public Sauce create_sauce();
}

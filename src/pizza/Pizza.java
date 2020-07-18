package pizza;

import ingredients.cheese.Cheese;
import ingredients.clams.Clams;
import ingredients.dough.Dough;
import ingredients.pepperoni.Pepperoni;
import ingredients.sauce.Sauce;
import ingredients.veggies.Veggies;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Pizza {
    public String name;
    public Cheese cheese;
    public Clams clams;
    public Dough dough;
    public Pepperoni pepperoni;
    public Sauce sauce;
    public Veggies[] veggies;
    public double bakeTime = 0;

    public abstract void prepare();

    public abstract double getCost();

    public void bake() {
        System.out.println("Bake for " + bakeTime + " minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String getIngredients(){
        return toString();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", cheese=" + cheese +
                ", clams=" + clams +
                ", dough=" + dough +
                ", pepperoni=" + pepperoni +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                '}';
    }
}




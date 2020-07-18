package pizza;

/**
 * Reduce the dependencies to concrete classes by providing a factory class
 */

public abstract class PizzaStore {

    Pizza pizza;

    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public String getIngredients(){
        return pizza.getIngredients();
    }

    public double getCost(){
        return pizza.getCost();
    }

}

package pizza.chicago;
import pizza.Pizza;
import pizza.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;

        if (item.equals("PEPPERONI")){
            pizza = new ChicagoPepperoniPizza();
        }

        return pizza;
    }
}

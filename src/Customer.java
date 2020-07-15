import pizza.PizzaStore;
import pizza.chicago.ChicagoPizzaStore;

/**
 * The factory method defines an interface for creating an object, but lets subclasses decided which class to instantiate. Factory Method
 * lets a class defer instantiation to subclasses.
 */

public class Customer {

    public static void main(String[] args) {
        PizzaStore store = new ChicagoPizzaStore();
        store.orderPizza("PEPPERONI");

    }

}

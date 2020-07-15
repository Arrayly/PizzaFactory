package pizza.chicago;


import pizza.Pizza;

public class ChicagoPepperoniPizza extends Pizza {

    public ChicagoPepperoniPizza(){
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
        toppings.add("Sliced Pepperoni");
    }

    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}

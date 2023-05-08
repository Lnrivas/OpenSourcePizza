/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Mastery	Project 2:	More Classes - PART 3: PizzaDriver
 * The purpose of this class is to have the main() method which tests the methods from the Pizza and PizzaOrder classes.
 * It creates 4 Pizzas and attempts to add them all to a PizzaOrder.
 * It then prints the PizzaOrder.
 * @version 1.0
 */
public class PizzaDriver {

  /**
    * Creates 4 pizzas. The first 2 with constructors, the other 2 with copy constructors of the Pizza class.
    * Creates a PizzaOrder for 3 pizzas using a PizzaOrder constructor.
    * Attempts to add the 4 pizzas to the order using the addPizza() method from the PizzaOrder class. The 4th Pizza won't be added because the order will already be full.
    * Prints the PizzaOrder.
    * @param args command-line arguments
    */
  public static void main(String [] args) {
    Pizza pizza1 = new Pizza ("small", 1, 0, 1); // Code to create a small pizza, 1 cheese, 1 veggie
    Pizza pizza2 = new Pizza ("large", 2, 2, 0); // Code to create a large pizza, 2 cheese, 2 pepperoni
    Pizza pizza3 = new Pizza(pizza2); // Same as pizza 2, use copy constructor
    Pizza pizza4 = new Pizza(pizza1); // Same as pizza 1, use copy constructor
    PizzaOrder order = new PizzaOrder(3); // Code to create an order of THREE pizzas
    System.out.println(order.addPizza(pizza1)); // add pizza1 to the order
    System.out.println(order.addPizza(pizza2)); // add pizza2 to the order
    System.out.println(order.addPizza(pizza3)); // add pizza3 to the order
    System.out.println(order.addPizza(pizza4)); // add pizza4 to the order – what happens here?
    System.out.println(order); // Should call order’s toString method
  }
}

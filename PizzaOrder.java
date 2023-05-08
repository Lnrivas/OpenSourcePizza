/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Mastery	Project 2:	More Classes - PART 2: PizzaOrder
 * The purpose of this class is to create a PizzaOrder which is an array of type Pizza
 * It also calculates the total cost of the order, utilizing the calcCost() method from the Pizza class
 * Note: I added the instance variable pizzasCurrentlyInOrder so the addPizza() method knows when the order is already full.
 * @version 1.0
 */
public class PizzaOrder {
  /**
    * An array holding all the pizzas in the order
    */
  private Pizza [] m_order;

  /**
    * The number of pizzas the order will contain
    */
  private int m_numPizzas;

  /**
    * The number of pizzas already added to the order
    */
  private static int pizzasCurrentlyInOrder;

  /**
    * Default constructor initializing m_order as an array of size 1 containing a small cheese pizza with no other toppings.
    * initializes m_numPizzas to 1 because the order will only contain 1 pizza.
    */
  public PizzaOrder() {
    m_order = new Pizza [1];
    m_order[0] = new Pizza("small", 1, 0, 0);
    m_numPizzas = 1;
  }

  /**
    * Constructor initializing m_order to an empty array of numPizzas size, containing pizzas.
    * Initializes m_numPizzas to numPizzas, the size of the order.
    * Initializes pizzasCurrentlyInOrder to 0.
    * @param numPizzas the number of pizzas the order will contain
    */
  public PizzaOrder(int numPizzas) {
    m_order = new Pizza[numPizzas];
    m_numPizzas = numPizzas;
    pizzasCurrentlyInOrder = 0;
  }

  /**
    * If there is still space in the order, adds a Pizza to the next open spot in the order and return 1.
    * Returns -1 if the order is already full.
    * @param pizza the Pizza being added to the order.
    */
  public int addPizza(Pizza pizza) {
    if (pizzasCurrentlyInOrder < m_numPizzas) {
      m_order[pizzasCurrentlyInOrder] = new Pizza(pizza);
      pizzasCurrentlyInOrder++;
      return 1;
    }
    else {
      return -1;
    }
  }

  /**
    * Calculates and returns the total cost of the order.
    * Calls the calcCost() method from the Pizza class to get the cost of each indivdual Pizza and then adds them all together.
    * @return a double value, the total cost of the order.
    */
  public double calcTotal() {
    double total = 0.0;
    for (Pizza pizza: m_order) {
      total += pizza.calcCost();
    }
    return total;
  }

  /**
    * toString() method neatly returning all PizzaOrder information as a String.
    * calls the toString() of the Pizza class for each pizza to return it's information.
    * calculates the total cost of the order by calling the calcTotal() method.
    * @return a String value neatly showing all PizzaOrder instance variables.
    */
  public String toString() {
    String ret = "";
    for (Pizza pizza: m_order) {
      ret += "\n" + pizza.toString();
    }
    return "Order: " + ret + "\nTotal cost: $" + calcTotal();
  }
}

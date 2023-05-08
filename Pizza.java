/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Mastery	Project 2:	More Classes - PART 1: Pizza
 * The purpose of this program is to create a Pizza class conatining it's size, number of cheese toppings, number of pepperoni toppings, and number of veggie toppings.
 * It also calculates the cost of a pizza, based on its size and number of toppings.
 * @version 1.0
 */
public class Pizza {
  /**
    * The size of the pizza ("small", "medium", or "large")
    */
  private String pizzaSize;

  /**
    * The number of cheese toppings
    */
  private int cheeseToppings;

  /**
    * The number of pepperoni topings
    */
  private int pepperoniToppings;

  /**
    * The number of veggie toppings
    */
  private int veggieToppings;

  /**
    * Default constructor initializing size to "small" and all toppings to 0.
    */
  public Pizza() {
    pizzaSize = "small";
    cheeseToppings = 0;
    pepperoniToppings = 0;
    veggieToppings = 0;
  }

  /**
    * Constructor initializing pizzaSize to size, cheeseToppings to cheese,
    * pepperoniToppings to pepperoni, and veggieToppings to veggie.
    * @param size size of the pizza
    * @param cheese number of cheese toppings
    * @param pepperoni number of pepperoni toppings
    * @param veggie number of veggie toppings
    */
  public Pizza(String size, int cheese, int pepperoni, int veggie) {
    pizzaSize = size;
    cheeseToppings = cheese;
    pepperoniToppings = pepperoni;
    veggieToppings = veggie;
  }

  /**
    * Copy constructor initializing all fields of the Pizza to the fields of the passed in Pizza.
    * @param Pizza Pizza to be copied
    */
  public Pizza(Pizza pizza) {
    this.pizzaSize = pizza.pizzaSize;
    this.cheeseToppings = pizza.cheeseToppings;
    this.pepperoniToppings = pizza.pepperoniToppings;
    this.veggieToppings = pizza.veggieToppings;
  }

  /**
    * Accessor method returning pizzaSize.
    * @return a String value pizzaSize, the size of the pizza
    */
  public String getPizzaSize() {
    return pizzaSize;
  }

  /**
    * Mutator method to set pizzaSize to size.
    * @param q1 the grade for quiz 1
    */
  public void setPizzaSize(String size) {
    pizzaSize = size;
  }

  /**
    * Accessor method returning cheeseToppings.
    * @return an int value cheeseToppings, the number of cheese toppings
    */
  public int getCheeseToppings() {
    return cheeseToppings;
  }

  /**
    * Mutator method to set cheeseToppings to cheese.
    * @param cheese the number of cheese toppings
    */
  public void setCheeseToppings(int cheese) {
    cheeseToppings = cheese;
  }

  /**
    * Accessor method returning pepperoniToppings.
    * @return an int value pepperoniToppings, the number of pepperoni toppings
    */
  public int getPepperoniToppings() {
    return pepperoniToppings;
  }

  /**
    * Mutator method to set pepperoniToppings to pepperoni.
    * @param pepperoni the number of pepperoni toppings
    */
  public void setPepperoniToppings(int pepperoni) {
    pepperoniToppings = pepperoni;
  }

  /**
    * Accessor method returning veggieToppings.
    * @return an int value veggieToppings, the number of veggie toppings
    */
  public int getVeggieToppings() {
    return veggieToppings;
  }

  /**
    * Mutator method to set veggieToppings to veggie.
    * @param veggie the number of veggie toppings
    */
  public void setVeggieToppings(int veggie) {
    veggieToppings = veggie;
  }

  /**
    * Calculates and returns the cost of the pizza based on the size and number of toppings.
    * small = $10, medium = $12, large = $14
    * Each topping adds $2 to the cost.
    * @return a double value, the cost of the pizza.
    */
  public double calcCost() {
    if (pizzaSize.equals("small")) {
      return 10.0 + ((cheeseToppings + pepperoniToppings + veggieToppings) * 2);

    }
    else if (pizzaSize.equals("medium")) {
      return 12.0 + ((cheeseToppings + pepperoniToppings + veggieToppings) * 2);
    }
    else {
      return 14.0 + ((cheeseToppings + pepperoniToppings + veggieToppings) * 2);
    }
  }

  /**
    * toString() method neatly returning all Pizza information as a String.
    * @return a String value neatly showing all Pizza instance variables.
    */
  public String toString() {
    return ("A " + pizzaSize + " pizza with " + cheeseToppings + " cheese topping(s), " + pepperoniToppings +
            " pepperoni topping(s), and " + veggieToppings + " veggie topping(s) costs $" + calcCost());
  }
}

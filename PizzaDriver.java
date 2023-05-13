/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Mastery	Project 2:	More Classes - PART 3: PizzaDriver
 * The purpose of this class is to have the main() method which tests the methods from the Pizza and PizzaOrder classes.
 * It creates 4 Pizzas and attempts to add them all to a PizzaOrder.
 * It then prints the PizzaOrder.
 * @version 1.1
 */
import java.util.Scanner;

public class PizzaDriver {
  public static void main(String [] args) {

    Scanner input = new Scanner(System.in);

    try {
      System.out.println("How many pizzas would you like to order?");
      int numPizzas = input.nextInt();
      input.nextLine(); // consume the newline character left by nextInt()

      PizzaOrder order = new PizzaOrder(numPizzas);

      for (int i = 1; i <= numPizzas; i++) {
        System.out.printf("Enter details for pizza %d (size, cheese, pepperoni, veggies, garlic):%n", i);
        String size = input.nextLine();
        int cheese = input.nextInt();
        int pepperoni = input.nextInt();
        int veggies = input.nextInt();
        int garlic = input.nextInt();
        input.nextLine(); // consume the newline character left by nextInt()

        Pizza pizza = new Pizza (size, cheese, pepperoni, veggies, garlic);

        if (order.addPizza(pizza) == -1) {
          System.out.printf("Error: Could not add pizza %d to order.%n", i);
        }
      }

      System.out.println(order);
    } catch (Exception e) {
      System.out.println("Error: Invalid input.");
    } finally {
      input.close();
    }
  }
}


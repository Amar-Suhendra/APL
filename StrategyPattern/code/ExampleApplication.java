package StrategyPattern.code;
import java.util.Scanner;

public class ExampleApplication {
  public static void main(String[] args) {
    
    // Inintialize the variables
    int a = 0;
    int b = 0; 
    int result = 0;
    String action = "";

    // Create context object
    Context context = new Context();

    try (
      Scanner scanner = new Scanner(System.in)) {
      // Scann for user input
      System.out.print("Enter the first number: ");
      a = scanner.nextInt();
      System.out.print("Enter the second number: ");
      b = scanner.nextInt();

      // Scann for user action
      System.out.print("Enter the action to perform: ");
      action = scanner.next();
    }catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

    // Check the action and set the strategy
    if (action.equals("addition")) {
      context.setStrategy(new ConcreteStrategyAdd());
    } else if (action.equals("substract")) {
      context.setStrategy(new ConcreteStrategySubstract());
    } else if (action.equals("multiply")) {
      context.setStrategy(new ConcreteStrategyMultiply());
    } else {
      System.out.println("Error: Invalid action");
      System.exit(0);
    }

    // Execute the strategy
    result = context.executeStrategy(a, b);
    System.out.println("Result: " + result);
  }
}

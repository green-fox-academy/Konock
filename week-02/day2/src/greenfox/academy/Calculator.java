package greenfox.academy;

import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
    System.out.println("Welcome to the Calculator App.\nPlease type in the expression:\n(Example: + 3 3)");
    Scanner scanner = new Scanner(System.in);
    String operation = scanner.nextLine();
    int operand1 = scanner.nextInt();
    int operand2 = scanner.nextInt();
    calculate(operation, operand1, operand2);
  }

  public static void calculate(String operation, int operand1, int operand2) {
    int result;
    switch (operation) {
      case "+": result = operand1 + operand2;
        System.out.println(result);
      break;
      case "-": result = operand1 - operand2;
        System.out.println(result);
      break;
      case "*": result = operand1 * operand2;
        System.out.println(result);
      break;
      case "/": result = operand1/operand2;
        System.out.println(result);
        break;
      case "%": result = operand1%operand2;
        System.out.println(result);
        break;
    }
  }
}

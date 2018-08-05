package greenfox.academy;

import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %   %
    // %   %
    // %   %
    // %   %
    // %%%%%
    //
    // The square should have as many lines as the number was

    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    // Outer loop handling the number of rows
    for (int rows = 1; rows <= number; rows++) {
      // Inner loop handling the number of characters
      for (int chars = 1; chars <= number; chars++) {
          System.out.print("%");
        if ((rows > 1 && chars > 1) && (rows < number && chars < number)) {
          System.out.println(" ");
        }
      }
      System.out.println("");
    }
  }
}

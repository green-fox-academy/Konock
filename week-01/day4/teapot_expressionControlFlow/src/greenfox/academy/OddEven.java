package greenfox.academy;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.

    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    double number = scanner.nextInt();

    if (number%2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}

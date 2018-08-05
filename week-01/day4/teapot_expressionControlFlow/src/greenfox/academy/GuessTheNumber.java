package greenfox.academy;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stored number is lower
    // You found the number: 8

    // Generates a random number between 1 and 20
    Random rand = new Random();
    int n = rand.nextInt(20) + 1;
    int guess = 0;

    // Asks the user to enter a guess
    while (guess != n) {
      System.out.println("Guess the number! Enter a guess between 1 and 20: ");
      Scanner scanner = new Scanner(System.in);
      guess = scanner.nextInt();
      if (guess < n) {
        System.out.println("The stored number is higher. Guess again!");
      } else if (guess > n) {
        System.out.println("The stored number is lower. Guess again!");
      }
    }
    System.out.println("You guessed the number!");



  }
}

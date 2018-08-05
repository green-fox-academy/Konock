package greenfox.academy;

import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int intArray[] = new int[number];
    double sum = 0;

    for (int i = 1; i <= number; i++) {
      System.out.println("Enter the " + i + ". number: ");
      intArray[i - 1] = scanner.nextInt();
    }

    for (int countSum : intArray) {
      sum += countSum;
    }
    int sumInt = (int) (sum);
    double average = sum / intArray.length;
    System.out.println("Sum: " + sumInt + ", Average: " + average);
  }
}

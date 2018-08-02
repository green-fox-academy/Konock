package greenfox.academy;

import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4
    System.out.println("Enter the first number: ");
    Scanner scanner1 = new Scanner(System.in);
    int n1 = scanner1.nextInt();
    System.out.println("Enter the second number: ");
    Scanner scanner2 = new Scanner(System.in);
    int n2 = scanner2.nextInt();
    System.out.println("Enter the third number: ");
    Scanner scanner3 = new Scanner(System.in);
    int n3 = scanner3.nextInt();
    System.out.println("Enter the fourth number: ");
    Scanner scanner4 = new Scanner(System.in);
    int n4 = scanner4.nextInt();
    System.out.println("Enter the fifth number: ");
    Scanner scanner5 = new Scanner(System.in);
    int n5 = scanner5.nextInt();
    int sum = n1+n2+n3+n4+n5;
    double average = sum/5;
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);

    // Should probably do this with a for loop but I will come back later
  }
}

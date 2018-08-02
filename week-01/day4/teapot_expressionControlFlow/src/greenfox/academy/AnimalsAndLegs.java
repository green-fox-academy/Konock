package greenfox.academy;

import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
    System.out.println("Enter the number of chickens: ");
    Scanner scanner = new Scanner(System.in);
    int chickens = scanner.nextInt();
    System.out.println("Enter the number of pigs: ");
    Scanner scanner2 = new Scanner(System.in);
    int pigs = scanner2.nextInt();
    int legs = (chickens*2)+(pigs*4);
    System.out.println("The sum of legs is: " + legs);
  }
}

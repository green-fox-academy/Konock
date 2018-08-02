package greenfox.academy;

import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second the boys
    // It should print: The party is excellent!
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    //
    // It should print: Quite cool party!
    // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    //
    // It should print: Average party...
    // If there are less people coming than 20
    //
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people

    System.out.println("Enter the number of girls coming to the party: ");
    Scanner scanner = new Scanner(System.in);
    int number1 = scanner.nextInt();
    System.out.println("Enter the number of boys coming to the party: ");
    Scanner scanner2 = new Scanner(System.in);
    int number2 = scanner2.nextInt();
    int sum = number1+number2;

    if ((number1 == number2) && (sum >= 20)) {
      System.out.println("The party is excellent!");
    } else if ((number1 != number2) && (sum >= 20)) {
      System.out.println("Quite cool party!");
    } else if ((sum < 20) && (number1 > 0)) {
      System.out.println("Average party...");
    } else if (number1 == 0) {
      System.out.println("Sausage party");
    }

  }
}

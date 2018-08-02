package greenfox.academy;

import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it

    System.out.println("Enter a distance in kilometers: ");
    Scanner scanner = new Scanner(System.in);
    int distance = scanner.nextInt();
    double distanceInMiles = distance*0.621371192;
    System.out.println("In miles this is about: " + Math.round(distanceInMiles));
  }
}

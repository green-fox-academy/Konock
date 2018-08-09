package greenfox.academy;

import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
  public static void main(String[] args) {
    System.out.println("Please enter a number:");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println("The one standing at place Nr: " + joseph(number) + " will survive.");
  }

  static ArrayList<Integer> joseph(int number) {
    // Fill up ArrayList with 1 to given number
    ArrayList<Integer> bestPlace = new ArrayList<>();
    for (int i = 1; i <= number; i++) {
      bestPlace.add(i);
    }

    // Program counts until it gets an ArrayList with only one element
    while (bestPlace.size() != 1) {
      // Every next element is removed from the list
      for (int i = 1; i < bestPlace.size(); i++) {
        bestPlace.remove(i);
        // If counting reaches the last element, it removes the first index
        // and restarts the counter from zero,
        // this helps resembling the circle form
        if (i == bestPlace.size() - 1) {
          bestPlace.remove(0);
          i = 0;
        }
      }
    }
    return bestPlace;
  }
}

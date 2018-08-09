package greenfox.academy;

import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
  public static void main(String[] args) {
    System.out.println("Please enter a number:");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(joseph(number));
  }
  static ArrayList<Integer> joseph(int number) {
    ArrayList<Integer> bestPlace = new ArrayList<>();
    for (int i=1; i<number; i++) {
      bestPlace.add(i);
    }
    while (bestPlace.size() != 1) {
      for (int i = 1; i < bestPlace.size(); i += 2) {
        bestPlace.remove(i);
      }
    }
    return bestPlace;
  }
}

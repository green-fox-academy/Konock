package greenfox.academy;

import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %%  %
    // % % %
    // %  %%
    // %%%%%
    //
    // The square should have as many lines as the number was

    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    String prozent = "%";

    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= number; j++) {
        if (j == 1 || j == number) {
          System.out.print(prozent);
        } else {
          System.out.print(" ");
        }
        System.out.println(prozent);
      }
    }
  }
}

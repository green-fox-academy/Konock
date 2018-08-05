package greenfox.academy;

import java.util.Scanner;

public class DrawDiamond {

  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was

    // Asking for input and declaring variable for symbols
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int star = 0;
    int space = number;

     if (number%2 != 0) {
       System.out.println("Please enter an even number!");
       System.out.println(("(I'll change the code later to handle odd number of rows as well)"));
       System.out.println("Thank you for your understanding!");
     } else {

      // Upper half of diamond. Outer loop handling the number of rows
      for (int uRows = 1; uRows <= number / 2; uRows++) {
        // First inner loop for handling spaces
        for (int uSpaceC = 0; uSpaceC < space; uSpaceC++) {
          System.out.print(" ");
        }
        // Second inner loop for handling stars
        for (int uStarC = 0; uStarC <= star; uStarC++) {
          System.out.print("*");
        }
        // Linebreak
        System.out.println("");
        space--;
        star = star + 2;
      }
      // Bottom half of diamond. Outer loop handling the number of rows
      for (int bRows = 0; bRows <= number / 2; bRows++) {
        //First inner loop for handling spaces
        for (int bSpaceC = number - 1; bSpaceC >= space; bSpaceC--) {
          System.out.print(" ");
        }
        // Second inner loop for handling stars
        for (int bStarC = star + 1; bStarC >= 1; bStarC--) {
          System.out.print("*");
        }
        // Linebreak
        System.out.println("");
        space--;
        star = star - 2;
      }
    }
  }
}

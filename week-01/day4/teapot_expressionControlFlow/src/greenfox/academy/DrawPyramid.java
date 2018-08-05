package greenfox.academy;

import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

    // Asking for input and declaring variable for symbols
    System.out.println("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int star = 0;
    int spaceChar = number;

    // Outer loop handling the number of rows
    for (int rows=1; rows<=number; rows++) {
      // First inner loop for handling spaces
      for (int spaceC=0; spaceC<spaceChar; spaceC++) {
        System.out.print(" ");
      }
      // Second inner loop for handling stars
      for (int starC=0; starC<=star; starC++) {
        System.out.print("*");
      }
      // Linebreak
      System.out.println("");
      spaceChar--;
      star = star+2;
    }
  }
}
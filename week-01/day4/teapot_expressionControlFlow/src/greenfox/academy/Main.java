package greenfox.academy;

// Loads scanner, use option+enter for shorthand

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    /*
    Cheat Sheet
    cmd + option + l - reformat code
    option + p - run code
    make sure class name and file name are the same
    cmd + / - comment out line
    */
    int a = 10;
    // You can assign the value to an empty variable instead of declaring the value right away.
    int b;
    b = 10;
    double c = 2.5;
    float d = 2.5f;
    // long variable type can store a bigger value than 2**32
    long e = 100000000;
    boolean bool = true;
    // char represents a character in the ASCII table
    // also, mind the single quotation mark '
    char myChar = 'A';
    String hello = "Hello";

    int addition = a + b;
    System.out.println(addition);

    String helloTeapot = "2" + 2;
    System.out.println(helloTeapot);

    // Conditions
    int bigNumber = 50;
    if (bigNumber > 15) {
      System.out.println("Wow that is a big number");
    } else {
      System.out.println("Aww that is a small number");
    }

    for (int i = 0; i < 10; i++) {
      System.out.println("Print this ten times");

    }

    int j = 0;
    while (j < 5) {
      System.out.println("Print this five times");
      j++;
    }

    /* do loops:
    do {
      this
    } while (condition)
    */

    // How to ask for user input, or the Scanner

    // Creates a scanner
    Scanner scanner = new Scanner(System.in);

    // The program stops and waits for user input and to press enter
    String userInput1 = scanner.nextLine();

    // It prints the whole line that was given by the user
    System.out.println(userInput1);

    // The program stops and waits for user input that is an integer and to press enter
    int userInput2 = scanner.nextInt();

    // It prints the integer
    System.out.println(userInput2);


  }
}

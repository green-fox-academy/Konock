package greenfox.academy;

import java.util.Arrays;

public class Strings {
  public static void main(String[] args) {
    String myString = "kiskutya kiscica";
    // This will return kiskutya, which is a substring of myString
    System.out.println(myString.substring(0, 8));
    // Split will return a String array and split the array to parts by the given "regex"
    // Leaving out the regex will make it split after every character
    // Entering a space will split the string to words, thus we can create a String array with each word as an element
    String[] myStringArray = myString.split(" ");
    // So to print it, we convert it back to Strings
    System.out.println(Arrays.toString(myStringArray));
  }
}

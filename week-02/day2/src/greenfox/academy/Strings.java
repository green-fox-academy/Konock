package greenfox.academy;

import java.util.Arrays;

public class Strings {
  public static void main(String[] args) {
    String myString = "kiskutyakiscica";
    // This will return kiskutya, which is a substring of myString
    System.out.println(myString.substring(0, 8));
    // Split string by character, this will cut the string and the given character and this will return a String array
    String[] myStringArray = myString.split("a");
    // So to print it, we convert it back to Strings
    System.out.println(Arrays.toString(myStringArray));

  }
}

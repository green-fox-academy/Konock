package greenfox.academy;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeBuilder {
  /*
  Create a function named create palindrome following your current language's style guide.
  It should take a string, create a palindrome from it and then return it.
  Example: greenfox > "greenfoxxofneerg"
   */

  public static void main(String[] args) {
    System.out.println(palindromeBuilder("greenfox"));
  }

  public static String palindromeBuilder(String word) {
    ArrayList<String> wordList = new ArrayList<>(Arrays.asList(word.split("")));
    for (int i=wordList.size()-1; i>=0; i--) {
      String character = wordList.get(i);
      word += character;
    }
    return word;
  }
}

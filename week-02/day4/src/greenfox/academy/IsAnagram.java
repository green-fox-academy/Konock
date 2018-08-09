package greenfox.academy;

import java.util.ArrayList;
import java.util.Arrays;

public class IsAnagram {
  /*
  Create a function named is anagram following your current language's style guide.
  It should take two strings and return a boolean value depending on whether its an anagram or not.
  Example: god > dog => true
  fox > green => false
  */
  public static void main(String[] args) {
    System.out.println(isAnagram("god", "dog"));
    System.out.println(isAnagram("fox", "green"));
  }

  public static boolean isAnagram(String word1, String word2) {
    ArrayList<String> words = new ArrayList<>(Arrays.asList(word1.split("")));
    ArrayList<String> moreWords = new ArrayList<>(Arrays.asList(word2.split("")));
    if (words.containsAll(moreWords) && moreWords.containsAll(words)) {
      return true;
    } else {
      return false;
    }
  }
}

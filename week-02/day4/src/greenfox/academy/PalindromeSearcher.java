package greenfox.academy;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeSearcher {
  /*
  Create a function named search palindrome following your current language's style guide.
  It should take a string, search for palindromes that at least 3 characters long and return a list with the found palindromes.

  Example: "racecar" > "racecar", "aceca", "cec"
   */

  public static void main(String[] args) {
    System.out.println(palindromeSearcher("racecar"));
  }

  public static ArrayList<String> palindromeSearcher(String word) {
    ArrayList<String> wordList = new ArrayList<>(Arrays.asList(word.split("")));
    ArrayList<String> palindromeList = new ArrayList<>();
    for (int i=0; i<wordList.size(); i++) {
      for (int j=wordList.size()-1; j>=0; j--) {
        if (wordList.get(i).equals(wordList.get(j))) {
          String pali = word.substring(i, j);
          palindromeList.add(pali);
        }
      }
      // if (wordList.get(i) == wordList.get(i+2)) {
      //   for (int j=i; j<=i; j++) {
      //     pali += wordList.get(j);
      //   }
      // } else {
//
      // }
    }
     return palindromeList;
  }

}

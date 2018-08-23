package greenfox.academy;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
  String string1;
  String string2;

  Anagram(String string1, String string2) {
    this.string1 = string1;
    this.string2 = string2;
  }


  public boolean isItAnagram(String string1, String string2) {
    ArrayList<String> letters1 = new ArrayList<>(Arrays.asList(string1.split("")));
    ArrayList<String> letters2 = new ArrayList<>(Arrays.asList(string2.split("")));
    return letters1.containsAll(letters2) && letters2.containsAll(letters1);
  }
}

package greenfox.academy;

import java.util.*;

public class AppendLetter{
  public static void main(String... args){
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.

    System.out.println(appendA(far));
  }

  public static List appendA(List<String> list) {
    for (int i=0; i<list.size(); i++) {
      String temp = list.get(i);
      list.set(i, temp + "a");
    }
    return list;
  }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"

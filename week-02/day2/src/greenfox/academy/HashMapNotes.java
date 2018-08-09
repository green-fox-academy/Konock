package greenfox.academy;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashMapNotes {
  public static void main(String[] args) {
    /* This is how to declare HashMap */
    HashMap<String, String> dictionary = new HashMap<String, String>();

    /*Adding elements to HashMap*/
    dictionary.put("Baum", "tree");
    dictionary.put("Katze", "cat");
    dictionary.put("Hund", "dog");

    /* Display content using forEach loop*/
    for (String word : dictionary.values()) {
      System.out.println(word);
    }

    /* Display content using Iterator*/
    Set set = dictionary.entrySet();
    Iterator iterator = set.iterator();
    while(iterator.hasNext()) {
      Map.Entry mentry = (Map.Entry)iterator.next();
      System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
      System.out.println(mentry.getValue());
    }

    /* Get values based on key*/
    String var= dictionary.get("Baum");
    System.out.println("Value of Baum is: "+var);

    /* Remove values based on key*/
    dictionary.remove("dog");
    System.out.println("Map key and values after removal:");
    Set set2 = dictionary.entrySet();
    Iterator iterator2 = set2.iterator();
    while(iterator2.hasNext()) {
      Map.Entry mentry2 = (Map.Entry)iterator2.next();
      System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
      System.out.println(mentry2.getValue());
    }

  }
}

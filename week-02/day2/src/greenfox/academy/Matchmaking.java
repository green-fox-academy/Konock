package greenfox.academy;

import java.util.*;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Expected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList makingMatches(ArrayList<String> list1, ArrayList<String> list2) {
    ArrayList<String> both = new ArrayList<String>();
    for (int i = 0; i < list1.size(); i++) {
      String temp = list1.get(i);
      String temp2 = list2.get(i);
      both.add(temp);
      both.add(temp2);
    }
    if (list1.size() > list2.size()) {
      String temp = list1.get(list1.size() - 1);
      both.add(temp);
    } else if (list2.size() > list1.size()) {
      String temp2 = list2.get(list2.size() - 1);
      both.add(temp2);
    }
    return both;
  }
}

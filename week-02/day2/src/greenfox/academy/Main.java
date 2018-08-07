package greenfox.academy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // List is the main class, ArrayList is a type of list, that's why we initialize them like this:
    // ArrayLists cannot contain primitive data types, that's why we use <Integer>
    List<Integer> list = new ArrayList<>();
    // Store a new Integer object with the value of 10
    list.add(Integer.valueOf(10));
    list.add(20);

    // Increment every list element by 2
    // Loop through all the elements
    for (int i = 0; i < list.size(); i++) {
      // Use .get to retrieve each element's value
      int newInt = list.get(i) + 2;
      // Use .set to change each element's value
      list.set(i, newInt);
    }

    System.out.println(list);

    // Different ways to initialize an ArrayList

    // Initialize ArrayList with initial capacity
    ArrayList<Integer> list2 = new ArrayList<Integer>(5);
    // Initialize ArrayList with elements
    // Basically, this creates an array and then loads the elements to an ArrayList
    ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(5, 6, 9348));
    System.out.println(list3);
    // Copy elements from another ArrayList
    list2.addAll(list3);
    System.out.println(list2);

    // Convert an existing array to ArrayList
    Integer[] array = {1, 2, 3, 4};
    ArrayList<Integer> fromArray = new ArrayList<>(Arrays.asList(array));
    System.out.println(fromArray);

    // ArrayList-specific methods

    // Check if ArrayList contains an element or more
    list3.contains(5);
    list3.containsAll(Arrays.asList(5, 6));

    // Remove elements from ArrayList by index or value
    list3.remove(0);
    list3.remove(Integer.valueOf(6));
    System.out.println(list3);

    // Check if ArrayList is empty
    System.out.println(list3.isEmpty());
    // Empty ArrayList
    list3.clear();
    System.out.println(list3.isEmpty());

  }
}

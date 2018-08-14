package greenfox.academy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DoableHomework {
  // Create 5 trees
  // Store the data of them in variables in your program
  // for every tree the program should store its'
  //  type
  //  leaf color
  //  age
  //  sex
  // you can use just variables, or lists and/or maps

  public static void main(String[] args) {
    ArrayList<Map<String, Object>> trees = new ArrayList<Map<String, Object>>();

    Map<String, Object> tree1 = new HashMap<String, Object>();
    tree1.put("type", "Birch");
    tree1.put("leaf color", "green");
    tree1.put("age", 9.5);
    tree1.put("sex", "male");
    trees.add(tree1);

    Map<String, Object> tree2 = new HashMap<String, Object>();
    tree2.put("type", "Oak");
    tree2.put("leaf color", "yellow");
    tree2.put("age", 100);
    tree2.put("sex", "male");
    trees.add(tree2);

    Map<String, Object> tree3 = new HashMap<String, Object>();
    tree3.put("type", "Mahogany");
    tree3.put("leaf color", "red");
    tree3.put("age", 21);
    tree3.put("sex", "male");
    trees.add(tree3);

    Map<String, Object> tree4 = new HashMap<String, Object>();
    tree4.put("type", "Yew");
    tree4.put("leaf color", "brown");
    tree4.put("age", 32);
    tree4.put("sex", "female");
    trees.add(tree4);

    Map<String, Object> tree5 = new HashMap<String, Object>();
    tree5.put("type", "Cherry");
    tree5.put("leaf color", "green");
    tree5.put("age", 8);
    tree5.put("sex", "female");
    trees.add(tree5);
  }
}

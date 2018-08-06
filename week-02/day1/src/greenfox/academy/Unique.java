package greenfox.academy;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    // System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
    unique(1, 11, 34, 11, 52, 61, 1, 34);
  }

  public static void unique(int... ints) {
    for (int i = 0; i < ints.length; i++) {
      if (ints[i] != ints[i + 1]) {
        System.out.print(ints[i] + " ");
      }
    }
  }
}

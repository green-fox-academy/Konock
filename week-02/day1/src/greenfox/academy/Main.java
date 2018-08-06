package greenfox.academy;

public class Main {

  public static void main(String[] args) {
    int[] array = {2, 3, 4};
    System.out.println(printIntArray(array));
  }

  // How to print an array
  public static String printIntArray(int[] array) {
    String result = "[";
    for (int i = 0; i < array.length; i++) {
      result += array[i];
      if (i != array.length - 1) {
        result += ", ";
      }
    }
    result += "]";
    return result;

    // For Each Loop
    //  for (int i : array) {
    //  }
    // Sort array
    //  Array.sort(array)
  }
}

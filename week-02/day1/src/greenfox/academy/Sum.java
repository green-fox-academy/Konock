package greenfox.academy;

public class Sum {
  //  Create the usual class wrapper
  //  and main method on your own.

  // - Write a function called `sum` that sum all the numbers
  //   until the given parameter and returns with an integer

  public static int sum(int input) {
    int sum = 0;
    for (int i = 1; i <= input; ++i) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sum(5));
  }
}

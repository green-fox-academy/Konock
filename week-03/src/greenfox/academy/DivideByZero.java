package greenfox.academy;

public class DivideByZero {
  // Create a function that takes a number
  // divides ten with it,
  // and prints the result.
  // It should print "fail" if the parameter is 0
  public static void main(String[] args) {
    divideTen(5);
    divideTen(0);
  }

  public static void divideTen(int num) {
    try { // Prevents the program breaking when attempting dividing by zero
      int result = 10 / num;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Can't divide by zero!"); // This line only runs if the input was 0
    }

  }
}

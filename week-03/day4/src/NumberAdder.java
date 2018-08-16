public class NumberAdder {
  // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

  public static void main(String[] args) {
    System.out.println(adder(10));
  }

  public static int adder(int n) {
    if (n == 1) return 1;
    else
      System.out.println(n);
    return adder(n - 1);
  }
}

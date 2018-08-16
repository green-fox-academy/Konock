public class SumDigit {
  // Given a non-negative int n, return the sum of its digits recursively (no loops).
  // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
  // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

  public static void main(String[] args) {
    System.out.println(sumDigit(12348));
  }

  public static int sumDigit(int n) {
    if (n < 10)
      return n;
    else
      System.out.println(n);
      return n % 10 + sumDigit(n / 10);
  }
}

public class Power {
  // Given base and n that are both 1 or more, compute recursively (no loops)
  // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

  public static void main(String[] args) {
    System.out.println(power(3, 4));
  }

  public static int power(int n, int p) {
    if (p == 0)
      return 1;
    else return n * power(n, p-1);
  }
}

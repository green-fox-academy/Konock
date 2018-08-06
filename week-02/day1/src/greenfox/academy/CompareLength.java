package greenfox.academy;

public class CompareLength {
  // - Create an array variable named `p1`
  //   with the following content: `[1, 2, 3]`
  // - Create an array variable named `p2`
  //   with the following content: `[4, 5]`
  // - Print if `p2` has more elements than `p1`

  public static void main(String[] args) {
    int[] p1 = {1, 2, 3};
    int[] p2 = {4, 5};
    if (p2.length > p1.length) {
      System.out.println("p2 has more elements");
    } else if (p1.length > p2.length) {
      System.out.println("p1 has more elements");
    } else {
      System.out.println("p1 and p2 have an equal number of elements");
    }
  }
}

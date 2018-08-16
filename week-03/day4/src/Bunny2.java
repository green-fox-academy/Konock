public class Bunny2 {
  // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
  // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
  // have 3 ears, because they each have a raised foot. Recursively return the
  // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

  public static void main(String[] args) {
    System.out.println(bunears2(5));
  }

  public static int bunears2(int bunnies) {
    int oddEars = 0;
    int evenEars = 0;
    if (bunnies == 1)
      return 2;
    else if (bunnies % 2 == 0)
      evenEars += 3 + bunears2(bunnies-1);
    else if (bunnies % 2 == 1)
      oddEars += 2 + bunears2(bunnies-1);
    return oddEars+evenEars;
  }
}

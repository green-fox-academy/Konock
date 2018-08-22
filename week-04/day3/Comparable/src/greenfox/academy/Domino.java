package greenfox.academy;

public class Domino implements Comparable {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }


  @Override
  public int compareTo(Object o) {
    return toString().compareTo(o.toString());
  }
}
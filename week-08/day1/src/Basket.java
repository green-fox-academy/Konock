import java.util.HashMap;
import java.util.Map;

public class Basket {
  Map<Integer, Integer> books;

  public Basket() {
    books = new HashMap<>();
  }

  public double calculate() {
    double sum = 0;
    if (books.size() == 0) {
      return 0;
    } else if (books.size() == 1) {
      for (Integer book : books.values())
        sum += book * 8;
      return sum;
    } else if (books.size() == 2) {
      for (Integer book : books.values())
        sum += book * 8 * 0.95;
      return sum;
    }
    return sum;
  }
}

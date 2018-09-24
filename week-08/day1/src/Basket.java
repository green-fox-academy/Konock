import java.util.HashMap;
import java.util.Map;

public class Basket {
  Map<Book, Integer> books;

  public Basket() {
    books = new HashMap<>();
  }

  public int calculate() {
    if (books.size() == 0)
      return 0;
    else
      return 0;
  }
}

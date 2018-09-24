import java.util.HashMap;
import java.util.Map;

public class Basket {
  Map<Integer, Integer> books;

  public Basket() {
    books = new HashMap<>();
  }

  public double calculateFullPrice() {
    double sum = 0;
    for (int book : books.values())
      sum += book * 8;
    return sum;
  }

  public double calculate5SetDiscount() {
    double discount = 0;
    if (books.size() == 5) {
      for (Integer book : books.values())
        discount += book * 2;
      for (Integer bookTitle: books.keySet()) {
        if (books.get(bookTitle) > 0)
          books.put(bookTitle, books.get(bookTitle)-1);
      }
    }
    removeZeroValues();
    return discount;
  }

  public double calculate4SetDiscount() {
    double discount = 0;
    if (books.size() == 4) {
      for (Integer book : books.values())
        discount += book * 1.6;
    }
    return discount;
  }

  public double calculate3SetDiscount() {
    double discount = 0;
    if (books.size() == 3) {
      for (Integer book : books.values())
        discount += book * 0.8;
    }
    return discount;
  }

  public double calculate2SetDiscount() {
    double discount = 0;
    if (books.size() == 2) {
      for (Integer book : books.values())
        discount += book * 0.4;
    }
    return discount;
  }

  public double calculateDiscountPrice() {
    return calculateFullPrice() - calculate5SetDiscount() - calculate4SetDiscount() - calculate3SetDiscount() - calculate2SetDiscount();
  }

  public void removeZeroValues() {
    books.values().remove(0);
  }
}

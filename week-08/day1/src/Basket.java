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
    while (books.size() == 5) {
      discount += 10;
      for (Integer bookTitle : books.keySet()) {
        if (books.get(bookTitle) > 0)
          books.put(bookTitle, books.get(bookTitle) - 1);

      }
      removeZeroValues();
    }

    return discount;
  }

  public double calculate4SetDiscount() {
    double discount = 0;
    while (books.size() == 4) {
      discount += 6.4;
      for (Integer bookTitle : books.keySet()) {
        if (books.get(bookTitle) > 0)
          books.put(bookTitle, books.get(bookTitle) - 1);
      }
      removeZeroValues();
    }
    return discount;
  }

  public double calculate3SetDiscount() {
    double discount = 0;
    while (books.size() == 3) {
      discount += 2.4;
      for (Integer bookTitle : books.keySet()) {
        if (books.get(bookTitle) > 0)
          books.put(bookTitle, books.get(bookTitle) - 1);
      }

      removeZeroValues();
    }
    return discount;
  }

  public double calculate2SetDiscount() {
    double discount = 0;
    while (books.size() == 2) {
      discount += 0.8;
      for (Integer bookTitle : books.keySet()) {
        if (books.get(bookTitle) > 0)
          books.put(bookTitle, books.get(bookTitle) - 1);
      }
      removeZeroValues();
    }
    return discount;
  }

  public double calculateDiscountPrice() {
    if (books.values().contains(1))
    {

    }
    return calculateFullPrice() - calculate5SetDiscount() - calculate4SetDiscount() - calculate3SetDiscount() - calculate2SetDiscount();
  }

  public void removeZeroValues() {
    while(books.values().remove(0));
  }
}

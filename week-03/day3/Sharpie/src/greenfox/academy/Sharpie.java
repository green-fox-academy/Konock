package greenfox.academy;

public class Sharpie {
  String color;
  double width;
  double inkAmount = 100;

  Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
  }

  double use() {
    inkAmount--;
    return inkAmount;
  }
}

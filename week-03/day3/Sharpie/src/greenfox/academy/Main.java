package greenfox.academy;

public class Main {

  public static void main(String[] args) {
    Sharpie pen1 = new Sharpie("black", 1.1);
    Sharpie pen2 = new Sharpie("green", 2.5);
    System.out.println(pen1.use());
    System.out.println(pen2.use());
  }
}

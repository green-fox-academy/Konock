package greenfox.academy;

public class Main {

  public static void main(String[] args) {
    Gnirts string1 = new Gnirts("example");
    System.out.println(string1.length());
    System.out.println(string1.charAt(1));
    System.out.println(string1.subSequence(0, 7));
    Shifter shifter1 = new Shifter("example", 2);
    System.out.println(shifter1.charAt(0));
  }
}

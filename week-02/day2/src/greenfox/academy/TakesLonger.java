package greenfox.academy;

public class TakesLonger {

  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    StringBuilder quote2 = new StringBuilder("\"Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.\"");
    System.out.println(quote2.indexOf(" you"));
    quote2.insert(22, "always takes longer than ");

    StringBuilder newString = new StringBuilder(quote);
    newString.insert(quote.indexOf("you"), "always takes longer than ");
    System.out.println(newString);

    System.out.println(quote2);
  }
}

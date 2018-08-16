public class String1 {
  // Given a string, compute recursively (no loops) a new string where all the
  // lowercase 'x' chars have been changed to 'y' chars.

  public static void main(String[] args) {
    System.out.println(stringY("xoxoxoxoxo"));
  }

  public static String stringY(String string) {
    if (!string.contains("x"))
      return string;
    else
      return stringY(string.replace("x", "y"));
  }
}

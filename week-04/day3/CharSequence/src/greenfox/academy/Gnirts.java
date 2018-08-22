package greenfox.academy;

public class Gnirts implements CharSequence {
  String string;

  Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return this.string.length();
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt(string.length()-1-index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String[] letters = string.split("");
    String reverse = "";
    for (int i = letters.length-1; i >= 0; i--) {
      reverse += letters[i];
    }
    return reverse.subSequence(start, end);
  }
}

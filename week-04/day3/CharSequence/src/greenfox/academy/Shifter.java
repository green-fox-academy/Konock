package greenfox.academy;

public class Shifter implements CharSequence{
  String string;
  int shift;

  Shifter(String string, int shift) {
    this.string = string;
    this.shift = shift;
  }

  @Override
  public int length() {
    return this.length();
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt(index+shift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return this.string.subSequence(start+shift, end+shift);
  }
}

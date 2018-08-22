package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    super.name = "Bass Guitar";
    super.numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings) {
    super.name = "Bass Guitar";
    super.numberOfStrings = numberOfStrings;
  }

  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }
}

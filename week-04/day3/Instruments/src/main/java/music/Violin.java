package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    super.name = "Violin";
    super.numberOfStrings = 4;
  }

  @Override
  public void sound() {
    System.out.println("Screech");
  }
}

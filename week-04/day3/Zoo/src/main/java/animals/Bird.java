package main.java.animals;

public class Bird extends Animal {
  public Bird(String name) {
    this.name = name;
    super.numberOfLegs = 2;
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public void eat() {
    System.out.println("eating worms");
  }

  @Override
  public void shit() {
    System.out.println("shooting piles of shit at humans");
  }
}

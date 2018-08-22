package main.java.animals;

public class Reptile extends Animal {
  public Reptile(String name) {
    this.name = name;
    super.numberOfLegs = 4;
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public void eat() {
    System.out.println("consuming insects and other animals ALIVE");
  }

  @Override
  public void shit() {
    System.out.println("pushing piles of poop out of its rear end");
  }
}

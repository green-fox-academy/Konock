package main.java.animals;

public class Mammal extends Animal{
  public Mammal(String name) {
    this.name = name;
    super.numberOfLegs = 4;
  }

  @Override
  public String breed() {
    return "pushing out miniature versions";
  }

  @Override
  public void eat() {
    System.out.println("consuming plants and other dead animals");
  }

  @Override
  public void shit() {
    System.out.println("producing piles of poop");
  }
}

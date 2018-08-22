package main.java.animals;

public abstract class Animal {
  protected String name;
  protected int age;
  protected int numberOfLegs;

  public String getName() {
    return this.name;
  }

  public abstract String breed();
  public abstract void eat();
  public abstract void shit();
}

package greenfox.academy;

public class Teapot {
  String name;
  int energy = 100;

  Teapot(String name) {
    this.name = name;
  }

  void code() {
    System.out.println("clackclackclack...");
    energy -= 20;
    System.out.println("Energy level: " + energy);
  }

  void drinkCoffee() {
    System.out.println("Drinking coffee...");
    System.out.println("Energy level restored by 30.");
    energy += 30;
    System.out.println("Energy level: " + energy);
  }

  void curse() {
    System.out.println("Beep this motherbeeping beepy code beep");
    energy -= 20;
    System.out.println("Energy level: " + energy);
  }
}

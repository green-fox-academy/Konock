package greenfox.academy;

public class Animal {
  int hunger = 50;
  int thirst = 50;

  void eat() {
    hunger--;
  }

  void drink() {
    thirst--;
  }

  void play() {
    hunger++;
    thirst++;
  }

  void checkStats() {
    System.out.println(hunger);
    System.out.println(thirst);
  }

}

package greenfox.academy;

public class Main {

  public static void main(String[] args) {
    Animal dog = new Animal();
    Animal cat = new Animal();
    Animal mouse = new Animal();

    dog.eat();
    cat.drink();
    mouse.play();
    dog.checkStats();
    cat.checkStats();
    mouse.checkStats();
  }
}

package greenfox.academy;

public class Weapon {
  String name;
  int baseAttack;

  Weapon(String name, int baseAttack) {
    this.name = name;
    this.baseAttack = baseAttack;
  }

  Weapon SolarFlare = new Weapon("Solarflare", 6);
}

package greenfox.academy;

import java.util.Random;

public class Mage {
  Random random = new Random();
  String name;
  int stamina;
  int intelligence;
  int healthPoint;
  int baseDamage;

  // Mage class constructor

  Mage(String name, int stamina, int intelligence) {
    this.name = name;
    this.stamina = stamina;
    this.intelligence = intelligence;
    healthPoint = random.nextInt(51) + 50 + stamina;
    baseDamage = rollDice10() + intelligence;
  }

  // Mage skills

  public int rollDice10() {
    int roll10 = random.nextInt(9) + 1;
    return roll10;
  }

  public int fireBall(Barbarian target) {
    int damage = baseDamage + rollDice10();
    System.out.println(name + " hurls a fireball at his enemies. It does " + damage + " damage.");
    target.healthPoint -= damage;
    return damage;
  }

  public int fireArrow(Barbarian target) {
    int arrowCount = random.nextInt(4) + 1;
    int damage = baseDamage + arrowCount * 2;
    System.out.println(name + " shoots " + arrowCount + " fiery arrows at his enemies. It does " + damage + " damage.");
    target.healthPoint -= damage;
    return damage;
  }

  public int fireWall(Barbarian target) {
    int damage = baseDamage + rollDice10();
    System.out.println(name + " creates a fiery firewall between him and his enemies. It does " + damage + " damage.");
    target.healthPoint -= damage;
    return damage;
  }

  public int eatFire(Mage target) {
    System.out.println(name + " does something that would seem horrible to a non-pyromaniac person. He begins to cast fire in his left palm and shoves it into his mouth. It heals him by " + stamina + " points.");
    target.healthPoint += stamina;
    return target.healthPoint;
  }
}
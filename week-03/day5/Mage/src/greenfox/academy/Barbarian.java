package greenfox.academy;

import java.util.Random;

public class Barbarian {
  Random random = new Random();
  //  Attributes
  String name;
  int strength;
  int stamina;
  int healthPoint;
  int baseDamage;

  //  The constructor
  public Barbarian(String name) {
    this.name = name;
    strength = rollDice10();
    stamina = rollDice10();
    healthPoint = rollHP() + stamina;
    baseDamage = rollDice10() + strength;
  }

  //  The Dices
  public int rollDice10() {
    int roll10 = random.nextInt(9) + 1;
    return roll10;
  }

  public int rollHP() {
    int roll100 = random.nextInt(51) + 50;
    return roll100;
  }

  //    The skills (methods)
//    The heal
  public int battleCry() {
    int heal = rollDice10() + stamina;
    healthPoint += heal;
    System.out.println(name + " used Battle Cry, and healed " + heal + " points. HP left: " + healthPoint);
    return healthPoint;
  }

  //    The weapons
  Weapon sword = new Weapon(5, true, false);
  Weapon axe = new Weapon(5, false, true);
  Weapon hammer = new Weapon(5, true, true);

  public void useWeapon(Barbarian barbarian, Mage mage) {
    int damage;
    int whichWeapon = random.nextInt(3) + 1;
    if (whichWeapon == 1) {
      damage = sword.weaponDamage + barbarian.baseDamage;
      barbarian.healthPoint += sword.selfHeal;
      barbarian.healthPoint -= sword.selfDamage;
      mage.healthPoint = mage.healthPoint - (sword.weaponDamage + barbarian.baseDamage);
      System.out.println(barbarian.name + " used his Enchanted Sword, and caused " + damage + " damage on " + mage.name + " and healed " + sword.selfHeal + " on himself.");
    } else if (whichWeapon == 2) {
      damage = axe.weaponDamage + barbarian.baseDamage;
      barbarian.healthPoint += axe.selfHeal;
      barbarian.healthPoint -= axe.selfDamage;
      mage.healthPoint -= (axe.weaponDamage + barbarian.baseDamage);
      System.out.println(barbarian.name + " used his Cursed Axe, and caused " + damage + " damage on " + mage.name + " and " + axe.selfDamage + " on himself.");
    } else {
      damage = hammer.weaponDamage + barbarian.baseDamage;
      barbarian.healthPoint += hammer.selfHeal;
      barbarian.healthPoint -= hammer.selfDamage;
      mage.healthPoint -= (hammer.weaponDamage + barbarian.baseDamage);
      System.out.println(barbarian.name + " used his Hammer of Absolute Destruction, and caused " + damage + " damage on " + mage.name + " and " + hammer.selfHeal + "/" + hammer.selfDamage + " heal/damage on himself.");
    }
  }
}
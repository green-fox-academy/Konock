package greenfox.academy;

public class MageWeapon {
  String name;
  boolean onFire = false;

  MageWeapon(String name, Mage user) {
    this.name = name;
    user.intelligence += 3;
    if (onFire)
      user.baseDamage += 5;
  }
}
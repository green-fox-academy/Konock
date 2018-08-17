package greenfox.academy;

public class Weapon {
  int weaponDamage;
  int selfHeal;
  int selfDamage;


  public Weapon(int weaponDamage, boolean enchanted, boolean cursed) {
    this.weaponDamage = weaponDamage;
    if (enchanted) {
      this.weaponDamage += 5;
      selfHeal = 5;
    }
    if (cursed) {
      this.weaponDamage += 5;
      selfDamage = 10;
    }
  }
}
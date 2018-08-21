package greenfox.academy;

public class Aircraft {
  private int maxAmmo;
  private int baseDamage;
  private int currentAmmo = 0;
  private int allDamage = 0;

  public int fight() {
    int damage = baseDamage * currentAmmo;
    currentAmmo = 0;
    allDamage += damage;
    return damage;
  }

  public int refill(int ammo) {
    currentAmmo = maxAmmo;
    return ammo - maxAmmo;
  }

  public String getType() {
    if (this instanceof F16)
      return "F16";
    else
      return "F35";
  }

  public String getStatus() {
    return "Type: " + getType() + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage;
  }

  public boolean isPriority() {
    if (this instanceof F16)
      return false;
    else
      return true;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }
}

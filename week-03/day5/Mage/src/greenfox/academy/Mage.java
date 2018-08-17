package greenfox.academy;

// Mage class properties

public class Mage {
  String name;
  int vitality;
  int intelligence;
  int baseHP = 100;
  int currentHP = 100;

  // Mage class constructor

  Mage(String name, int vitality, int intelligence) {
    this.name = name;
    this.vitality = vitality;
    this.intelligence = intelligence;
    baseHP += vitality;
    currentHP += vitality;
  }

  // Mage skills

  public int fireBall() {
    System.out.println(name + "hurls a fireball at his enemies.");
    return 7;
  }

  public int fireArrow() {
    int arrowCount = (int)(Math.random()*4);
    System.out.println(name + "shoots " + arrowCount + " fiery arrows at his enemies.");
    return arrowCount*2;
  }

  public int fireWall() {
    System.out.println(name + "creates a fiery firewall between him and his enemies.");
    return 8;
  }

  public int eatFire() {
    System.out.println(name + "does something that would seem horrible to a non-piromaniac person. He begins to cast fire in his left palm and shoves it into his mouth.");
    currentHP += vitality;
    return currentHP;
  }


  // My mage
  Mage KarlHeinz = new Mage("Karl-Heinz Börne", 12, 14);
}

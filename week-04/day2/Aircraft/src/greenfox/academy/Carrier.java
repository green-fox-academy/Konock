package greenfox.academy;

import java.util.ArrayList;

public class Carrier {
  private int HP;
  private int aircraftCount;
  private int ammoStorage;
  private int totalDamage;
  public ArrayList<Aircraft> carrier = new ArrayList<>();

  Carrier(int HP, int ammoStorage) {
    this.HP = HP;
    this.ammoStorage = ammoStorage;
  }

  public void add(Aircraft aircraft) {
    carrier.add(aircraft);
  }

  public void fill() {
    int ammoToFill = 0;
    for (Aircraft aircraft : carrier) {
      ammoToFill += aircraft.getMaxAmmo();
      if (ammoToFill <= ammoStorage) {
        ammoStorage -= aircraft.refill(ammoStorage);
      } else if (ammoToFill > ammoStorage) {
        while (aircraft.isPriority() && ammoStorage != 0)
          ammoStorage -= aircraft.refill(ammoStorage);
        while (ammoStorage != 0)
          ammoStorage -= aircraft.refill(ammoStorage);
      } else if (ammoStorage == 0) {
        System.out.println("No Ammo");
      }
    }
  }

  public void fight(Carrier target) {
    for (Aircraft aircraft : carrier) {
      target.HP -= aircraft.getCurrentAmmo();
    }
  }

  public void getStatus() {

  }
}

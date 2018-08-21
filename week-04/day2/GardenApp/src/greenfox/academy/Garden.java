package greenfox.academy;

import java.util.ArrayList;

public class Garden {
  private String name;
  private int waterAmount;
  private boolean needsWater;

  public Garden(String name) {
    this.name = name;
    waterAmount = 0;
    needsWater = true;
  }

  public void addPlant(ArrayList<Garden> plants, Garden plant) {
    plants = new ArrayList<>();
    plants.add(plant);
  }

  public void water(ArrayList<Garden> plants, int water) {
    int toWater = 0;
    for (Garden plant : plants) {
      if (plant.needsWater)
        toWater++;
      if (plant.needsWater)
        plant.waterAmount += water / toWater;
    }
  }
}

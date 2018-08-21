package greenfox.academy;

import java.util.ArrayList;

public class Garden {
  private String name;
  public ArrayList<Plant> plants = new ArrayList<>();

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void gardenStatus() {
    for (Plant plant : plants) {
      if (plant instanceof Flower)
        ((Flower)plant).checkStatus(plant);
      else
        ((Tree)plant).checkStatus(plant);
    }
  }

  public void waterGarden(int water) {
    int toWater = 0;
    for (Plant plant : plants) {
      if (plant instanceof Flower)
        ((Flower)plant).water(plant, water);
      else
        ((Tree)plant).water(plant, water);
    }
  }
}

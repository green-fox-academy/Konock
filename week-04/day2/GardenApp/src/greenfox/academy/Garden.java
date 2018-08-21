package greenfox.academy;

import java.util.ArrayList;

public class Garden {
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
    int toWater = water/plants.size();
    for (Plant plant : plants) {
      if (plant instanceof Flower)
        ((Flower)plant).water(plant, toWater);
      else
        ((Tree)plant).water(plant, toWater);
    }
  }
}

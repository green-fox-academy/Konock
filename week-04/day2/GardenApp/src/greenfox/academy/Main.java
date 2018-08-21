package greenfox.academy;

public class Main {

  public static void main(String[] args) {
    Garden garden = new Garden();
    Flower yellow = new Flower("yellow");
    garden.addPlant(yellow);
    Flower blue = new Flower("blue");
    garden.addPlant(blue);
    Tree purple = new Tree("purple");
    garden.addPlant(purple);
    Tree orange = new Tree("orange");
    garden.addPlant(orange);

    garden.gardenStatus();
    garden.waterGarden(40);
    garden.waterGarden(70);
    garden.gardenStatus();
  }
}

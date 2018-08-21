package greenfox.academy;

public class Flower extends Plant{
  Flower(String name) {
    super(name);
  }

  public void checkStatus(Plant flower) {
    if (flower.getWaterAmount() < 5)
      System.out.println("The " + flower.getName() + " Flower needs water");
    else
      System.out.println("The " + flower.getName() + " Flower does not need water");
  }

  public void water(Plant flower, int water) {
    double waterSum = flower.getWaterAmount() + water*0.75;
    flower.setWaterAmount(waterSum);
    if (flower.getWaterAmount() > 5)
      flower.setNeedsWater(false);
  }
}

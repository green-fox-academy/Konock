package greenfox.academy;

public class Flower extends Plant{
  Flower(String name) {
    super(name);
  }

  public void checkStatus(Plant flower) {
    if (super.getWaterAmount() < 5)
      System.out.println("The " + super.getName() + " Flower needs water");
    else
      System.out.println("The " + super.getName() + " Flower does not need water");
  }

  public void water(Plant flower, int water) {
    double waterSum = super.getWaterAmount() + water*0.75;
    super.setWaterAmount(waterSum);
    if (super.getWaterAmount() > 5)
      super.setNeedsWater(false);
  }
}

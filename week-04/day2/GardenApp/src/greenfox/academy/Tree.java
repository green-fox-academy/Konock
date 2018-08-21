package greenfox.academy;

public class Tree extends Plant {
  Tree(String name) {
    super(name);
  }

  public void checkStatus(Plant tree) {
    if (super.getWaterAmount() < 10)
      System.out.println("The " + super.getName() + " Tree needs water");
    else
      System.out.println("The " + super.getName() + " Tree does not need water");
  }

  public void water(Plant tree, int water) {
    double waterSum = super.getWaterAmount() + water*0.4;
    super.setWaterAmount(waterSum);
    if (super.getWaterAmount() > 10)
      super.setNeedsWater(false);
  }
}

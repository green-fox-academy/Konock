package greenfox.academy;

public class Tree extends Plant {
  Tree(String name) {
    super(name);
  }

  public void checkStatus(Plant tree) {
    if (tree.getWaterAmount() < 10)
      System.out.println("The " + tree.getName() + " Tree needs water");
    else
      System.out.println("The " + tree.getName() + " Tree does not need water");
  }

  public void water(Plant tree, int water) {
    double waterSum = tree.getWaterAmount() + water*0.4;
    tree.setWaterAmount(waterSum);
    if (tree.getWaterAmount() > 10)
      tree.setNeedsWater(false);
  }
}

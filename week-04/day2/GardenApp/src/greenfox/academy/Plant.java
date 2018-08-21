package greenfox.academy;

public class Plant {
  private String name;
  private double waterAmount;
  private boolean needsWater;

  Plant(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(double waterAmount) {
    this.waterAmount = waterAmount;
  }

  public boolean getNeedsWater() {
    return needsWater;
  }

  public void setNeedsWater(boolean value) {
    this.needsWater = value;
  }
}

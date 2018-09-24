import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  Basket basket = new Basket();

  @Test
  public void emptyBasketTest() {

    Assert.assertEquals(0, basket.calculate());
  }

  @Test
  public void singleVolumePriceTest() {
    basket.books.put(1, 1);
    Assert.assertEquals(8, basket.calculate());
  }

  @Test
  public void moreInstancesOfSameVolumeTest() {
    basket.books.put(2, 2);
    Assert.assertEquals(16, basket.calculate());
  }

  @Test
  public void getADiscountWithTwoDifferentVolumesTest() {
    basket.books.put(1, 1);
    basket.books.put(2, 1);
    basket.books.put(3, 1);
    basket.books.put(4, 1);
    basket.books.put(5, 1);
    Assert.assertEquals(5 * 8 * 0.75, basket.calculate(), 0);
  }


}

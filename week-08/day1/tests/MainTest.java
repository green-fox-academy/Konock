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
}

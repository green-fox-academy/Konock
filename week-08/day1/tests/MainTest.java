import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  @Test
  public void emptyBasketTest() {
    Basket basket = new Basket();
    Assert.assertEquals(0, basket.calculate());
  }
}

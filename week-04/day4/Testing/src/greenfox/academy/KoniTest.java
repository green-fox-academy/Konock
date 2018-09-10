package greenfox.academy;

import org.junit.Test;

import static org.junit.Assert.*;

public class KoniTest {

  @Test
  public void canKoniTest() {
    Koni koni = new Koni();
    assertTrue(koni.canKoniTest());
  }
}
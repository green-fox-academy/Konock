package greenfox.academy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
  @Test
  public void testOutput() {
    Apple apple = new Apple();
    assertEquals("apple", apple.getApple("apple"));
  }
}
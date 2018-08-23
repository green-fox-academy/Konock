package greenfox.academy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
  /*
  Create a sum method in your class which has an ArrayList of Integers as parameter
  It should return the sum of the elements in the list
  Follow these steps:
  Add a new test case
  Instantiate your class
  create a list of integers
  use the assertEquals to test the result of the created sum method
  Run them
  Create different tests where you
  test your method with an empty list
  with a list with one element in it
  with multiple elements in it
  with a null
  Run them
  Fix your code if needed
  */

  @Test
  public void doesItWorkAtAll() {
    Sum sum = new Sum();
    assertEquals(15, sum.sumInt(sum.initList(1, 2, 3, 4, 5)));
  }

  @Test
  public void doesItWorkWithOneElement() {
    Sum sum = new Sum();
    assertEquals(5, sum.sumInt(sum.initList(5)));
  }

  @Test
  public void doesItWorkWithNull(){
    Sum sum = new Sum();
    assertEquals(0, sum.sumInt(sum.initList(0)));
  }

}
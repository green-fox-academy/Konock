package greenfox.academy;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
  /*
  Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
  Create a test for that.
   */

  @Test
  public void doesItReturnDictionary() {
    CountLetters word = new CountLetters("doggy");
    assertTrue(word.countLetters() != null);
  }

  @Test
  public void doesItContainAllLetters() {
    CountLetters word = new CountLetters("doggy");
    assertEquals(4, word.countLetters().size());
  }

  @Test
  public void doesItCountMultipleLetters() {
    CountLetters word = new CountLetters("doggy");
    HashMap keys = word.countLetters();
    assertEquals(2, keys.get("g"));
  }

}
package greenfox.academy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  /*
  Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagrams or not.
  Create a test for that.
   */

  @Before
  public void initStrings() {
    Anagram anagram = new Anagram("god", "dog");
    assertEquals("god", anagram.string1);
    assertEquals("dog", anagram.string2);
  }

  @Test
  public void doesItWork() {
    Anagram anagram = new Anagram("god", "dog");
    assertTrue(anagram.isItAnagram("god", "dog"));
  }

  @Test
  public void doesItWorkReverse() {
    Anagram anagram = new Anagram("god", "dog");
    assertFalse(anagram.isItAnagram("gods", "dog"));
  }
}
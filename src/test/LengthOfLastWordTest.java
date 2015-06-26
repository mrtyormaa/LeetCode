package test;

import leetcode.solutions.LengthOfLastWord;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by asutosh on 6/22/15.
 */
public class LengthOfLastWordTest {

  @Test
  public void testLengthOfLastWord() throws Exception {
    int result = LengthOfLastWord.lengthOfLastWord("Hello World");
    assertEquals("Result Equals 5", 5, result);
  }

  @Test
  public void testBLank() throws Exception {
    int result = LengthOfLastWord.lengthOfLastWord(" ");
    assertEquals("Result Equals 0", 0, result);
  }
}
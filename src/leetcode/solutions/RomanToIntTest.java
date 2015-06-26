package leetcode.solutions;

import org.junit.Test;

import static org.junit.Assert.*;
// Created by asutosh on 6/25/15.

public class RomanToIntTest {

  @Test
  public void testRomanToInt() throws Exception {
    int result  = RomanToInt.romanToInt("XV");
    assertEquals("Result is 15", 15, result);
    result  = RomanToInt.romanToInt("X");
    assertEquals("Result is 10", 10, result);
    result  = RomanToInt.romanToInt("I");
    assertEquals("Result is 1", 1, result);
    result  = RomanToInt.romanToInt("III");
    assertEquals("Result is 3", 3, result);
    result  = RomanToInt.romanToInt("VI");
    assertEquals("Result is 6", 6, result);
    result  = RomanToInt.romanToInt("IX");
    assertEquals("Result is 9", 9, result);
    result  = RomanToInt.romanToInt("IV");
    assertEquals("Result is 4", 4, result);
  }
}
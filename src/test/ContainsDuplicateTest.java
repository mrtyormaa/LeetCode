package test;

import leetcode.solutions.ContainsDuplicate;
import org.junit.Test;

import static org.junit.Assert.*;
// Created by asutosh on 6/23/15.

public class ContainsDuplicateTest {

  @Test
  public void testContainsDuplicate() throws Exception {
    ContainsDuplicate sub = new ContainsDuplicate();
    int[] oneArr = {1};
    int[] uniqArr = {1,2,3,4,5,6};
    int[] dupArr = {1,2,3,1,2,5};
    int[] nullArr = {};
    boolean result = sub.containsDuplicate(oneArr);
    assertEquals("Result must be false for one element array", false, result);
    result = sub.containsDuplicate(uniqArr);
    assertEquals("Result must be false for unique array", false, result);
    result = sub.containsDuplicate(nullArr);
    assertEquals("Result must be false for null array", false, result);
    result = sub.containsDuplicate(dupArr);
    assertEquals("Result must be true for duplicate array", true, result);
  }
}
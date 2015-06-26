package test;

import leetcode.solutions.NumberOfPrimes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
// Created by asutosh on 6/23/15.

public class NumberOfPrimesTest {

  NumberOfPrimes prime = new NumberOfPrimes();

  @Before
  public void setUp() throws Exception {

  }

  @Test
  public void testCountPrimes() throws Exception {
    assertEquals("5", 3, prime.countPrimes(5));
    assertEquals("1", 2, prime.countPrimes(2));
    assertEquals("7", 4, prime.countPrimes(7));
    assertEquals("499979", 1230, prime.countPrimes(9979));
  }
}
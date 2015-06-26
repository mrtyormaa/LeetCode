package leetcode.solutions;// Created by asutosh on 6/23/15.

import java.util.HashSet;

public class NumberOfPrimes {
  public int countPrimes(int n) {
    if (n == 1)
      return 1;
    HashSet<Integer> primes = new HashSet<Integer>();
    primes.add(2);
    for (int i = 2; i < n; i++) {
      if (isPrime(i,primes))
        primes.add(i);
    }
    return primes.size() + 1;
  }
  private boolean isPrime(int x, HashSet<Integer> primes)
  {
    for (int p:primes){
      if (x%p == 0)
        return false;
    }
    return true;
  }
}

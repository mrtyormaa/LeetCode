package leetcode.solutions;

/* Created by asutosh on 6/25/15. */

import java.util.HashMap;

public class RomanToInt {
  public static int romanToInt(String s) {
    char[] romanChar = s.toCharArray();
    int[] romanInt = new int[romanChar.length];
    HashMap<Character, Integer> baseMap = new HashMap<>();
    int result = 0;
    baseMap.put('I', 1);
    baseMap.put('V', 5);
    baseMap.put('X', 10);
    baseMap.put('L', 50);
    baseMap.put('C', 100);
    baseMap.put('D', 500);
    baseMap.put('M', 1000);
    for (int i = 0; i < romanChar.length; i++) {
      romanInt[i] = baseMap.get(romanChar[i]);
    }
    for (int i = 0; i < romanChar.length - 1; i++) {
      if (romanInt[i] < romanInt[i+1])
        result = result - romanInt[i];
      else
        result = result + romanInt[i];
    }
    return result + romanInt[romanChar.length - 1];
  }
}

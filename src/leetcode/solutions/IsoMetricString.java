package leetcode.solutions;// Created by asutosh on 6/23/15.

import java.util.HashMap;
import java.util.HashSet;

public class IsoMetricString {
  public boolean isIsomorphic(String s, String t) {
    if((s.length() != t.length()) || s == null || t == null)
      return false;
    HashMap<Character,Character> map = new HashMap<Character,Character>();
    for (int i = 0; i < s.length(); i++) {
      char c1 = s.charAt(i);
      char c2 = t.charAt(i);
      if (map.containsKey(c1)){
        if (map.get(c1) != c2)
          return false;
      }
      else {
        if (!map.containsValue(c2))
          map.put(c1, c2);
        else
          return false;
      }
    }
    return true;
  }
}

import leetcode.solutions.LengthOfLastWord;
import leetcode.solutions.LongestCommonPrefix;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

public class Main {

  public static void main(String[] args) {
    System.out.println("LeetCode Practice");
//    LinkedList<Integer> intList = new LinkedList<>();
//    intList.add(15);
//    intList.add(7);
//    intList.add(3);
//    intList.add(9);
//    Collections.sort(intList);
//    if (intList.contains(3.25))
//      System.out.print("true");
//    System.out.print(intList);
    int[] A = {1,9,3,6,2,3,5,6,1,7,7,2,9};
    int x = 0;
    for (int a : A) {
      x = x ^ a;
      System.out.print(x  + " ");
    }
    System.out.print(x);
  }
}

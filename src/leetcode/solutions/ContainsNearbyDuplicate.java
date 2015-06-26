package leetcode.solutions;// Created by asutosh on 6/23/15.

import java.util.HashMap;

public class ContainsNearbyDuplicate {
  public boolean mySolution(int[] nums, int k) {
    if (nums == null || nums.length <= 1 || k == 0)
      return false;
    int size = 0;
    for (int j =0; j < nums.length-1; j++){
      if (j+k >= nums.length)
        size = nums.length;
      else
        size = j+k;
      for (int i = j+1; i < size; i++) {
        if (nums[i] == nums[j])
          return true;
      }
    }
    return false;
  }

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for(int i=0; i<nums.length; i++){
      if(map.containsKey(nums[i])){
        int pre = map.get(nums[i]);
        if(i-pre<=k)
          return true;
      }

      map.put(nums[i], i);
    }

    return false;
  }

}

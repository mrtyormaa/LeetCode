package leetcode.solutions;

import java.util.HashSet;

public class ContainsDuplicate {
  public boolean mySolution(int[] nums) {
    if (nums == null || nums.length <= 1)
      return false;
    for (int j =0; j < nums.length-1; j++){
      for (int i = j+1; i < nums.length; i++) {
        if (nums[i] == nums[j])
          return true;
      }
    }
    return false;
  }

  public boolean containsDuplicate(int[] nums) {
    if(nums==null || nums.length==0)
      return false;
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i: nums){
      if(!set.add(i)){
        return true;
      }
    }
    return false;
  }
}

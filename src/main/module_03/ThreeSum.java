package main.module_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    
    Set<List<Integer>> resultSet = new HashSet<>();
    
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> result = Arrays.asList(nums[i], nums[j], nums[k]);
            Collections.sort(result);
            resultSet.add(result);
          }
        }
      }
    }
    
    return new ArrayList<>(resultSet);
  }
  
}

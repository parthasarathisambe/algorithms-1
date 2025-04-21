package main.module_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum_BinarySearch {

  public List<List<Integer>> threeSum(int[] nums) {

    Set<List<Integer>> resultSet = new HashSet<>();
    Arrays.sort(nums);
    int n = nums.length;

    for (int i = 0; i < nums.length; i++) {
      int j = i + 1;
      int k = n - 1;

      int first = nums[i];

      while (j < k) {
        int tempSum = nums[j] + nums[k];
        if (first + tempSum == 0) {
          List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
          Collections.sort(triplet);
          resultSet.add(triplet);
          j++;
          k--;
        } else if (tempSum + first < 0) {
          j++;
        } else {
          k--;
        }
      }
    }

    return new ArrayList<>(resultSet);

  }

}

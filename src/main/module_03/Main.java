package main.module_03;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    int[] nums = { -1, 0, 1, 2, -1, -4 };

    ThreeSum_BinarySearch threeSum = new ThreeSum_BinarySearch();
    List<List<Integer>> result = threeSum.threeSum(nums);

    System.out.println(result);
  }

}

package main.module_03;

import java.util.Arrays;

public class SearchInBitonicArray {

  public static void main(String[] args) {

    int[] nums1 = { 2, 6, 8, 10, 12, 11, 9, 7 };
    System.out.println(new SearchInBitonicArray().search(nums1, 5));

    int[] nums2 = { 2, 6, 8, 15, 13, 11, 9, 7 };
    System.out.println(new SearchInBitonicArray().search(nums2, 5));

  }

  private boolean search(int[] nums, int x) {

    int n = nums.length;

    int l = 0;
    int r = n - 1;

    int flagIndex = 0;

    while (l <= r) {
      int mid = (l + r) / 2;

      int midEle = nums[mid];

      // this means that the index is in the set of increasing numbers
      if (midEle < nums[mid + 1] && midEle > nums[mid - 1]) {
        l = mid + 1;

        // this means that the index is in the set of decreasing numbers.
      } else if (midEle > nums[mid + 1] && midEle < nums[mid - 1]) {
        r = mid - 1;

      } else {
        flagIndex = mid;
        break;
      }

    }

    return findElementInAscArray(Arrays.copyOfRange(nums, 0, flagIndex + 1), x)
        || findElementInDscArray(Arrays.copyOfRange(nums, flagIndex, n), x);

  }

  private boolean findElementInAscArray(int[] sortedArray, int x) {

    int i = 0;
    int j = sortedArray.length - 1;

    while (i <= j) {
      int mid = (i + j) / 2;
      int midEle = sortedArray[mid];
      if (x == midEle) {
        return true;
      } else if (x < midEle) {
        j = mid - 1;
      } else {
        i = mid + 1;
      }
    }

    return false;

  }

  private boolean findElementInDscArray(int[] sortedArray, int x) {

    int i = 0;
    int j = sortedArray.length - 1;

    while (i <= j) {
      int mid = (i + j) / 2;
      int midEle = sortedArray[mid];
      if (x == midEle) {
        return true;
      } else if (x < midEle) {
        i = mid + 1;
      } else {
        j = mid - 1;
      }
    }

    return false;

  }

}

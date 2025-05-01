package main.module_07;

public class KthLargestElementInArray {

  public int findKth(int[] nums, int k) {
    int left = 0;
    int right = nums.length - 1;
    int target = nums.length - k;
    
    while (left <= right) {
      
      int j = partition(nums, left, right);
      
      if (j < target) {
        left = target + 1;
      } else if (j > target) {
        right = target - 1;
      } else {
        return nums[target];
      }
    }
    
    return -1;
    
  }

  private int partition(int[] nums, int left, int right) {
    int i = left;
    int j = right;
    
    while  (true) {
      
      if (nums[i] < nums[left]) {
        i++;
        if (i == right) {
          break;
        }
      }
      
      if (nums[left] < nums[j]) {
        j--;
        if (j == left) {
          break;
        }
      }
      
      if (i >= j) {
        break;
      }
      
      swap (nums, i, j);
    }
    
    swap(nums, left, j);
    return j;
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

}

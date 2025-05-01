package main.module_07;

public class Temp {
  public int findKthLargest(int[] nums, int k) {

    int n = nums.length;
    int low = 0;
    int high = n - 1;
    int index = k + 1;

    while (low <= high) {
      int pivot = partition(nums, low, high);
      if (index < pivot) {
        high = pivot - 1;
      } else if (index > pivot) {
        low = pivot + 1;
      } else {
        return nums[index];
      }
    }

    return nums[index];
  }

  private int partition(int[] nums, int low, int high) {
    int i = low;
    int j = high;

    while (true) {

      while (nums[i] >= nums[low]) {
        i++;
        if (i == high) {
          break;
        }
      }

      while (nums[j] < nums[low]) {
        j--;
        if (j == low) {
          break;
        }
      }

      if (i >= j) {
        break;
      }

      swap(nums, i, j);

    }
    return j;
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}

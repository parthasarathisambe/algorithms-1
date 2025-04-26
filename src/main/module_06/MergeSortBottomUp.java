package main.module_06;

/**
 * This algorithm is 10% slower than {@link MergeSortWithRecurrsion}.
 * 
 * REVISE THIS AGAIN
 */
public class MergeSortBottomUp {

  public void sort(Comparable[] arr) {

    int n = arr.length;
    Comparable[] aux = new Comparable[n];

    for (int size = 1; size < n; size *= 2) {
      for (int left = 0; left < n - size; left += 2 * size) {
        int mid = left + size - 1;
        int right = Math.min(left + 2 * size - 1, n - 1);
        SortUtils.merge(arr, aux, left, mid, right);
      }
    }
  }
}

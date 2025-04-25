package main.module_05;

/**
 * In iteration i, swap a[i] with each larger entry to its left.
 * 
 * Complexity is (N^2 / 4) on average. But its (N^2 / 2) in worst case.
 */
public class InsertionSort {

  public void sort(Comparable[] arr) {

    int n = arr.length;

    for (int i = 1; i < n; i++) {
      for (int j = i; j > 0; j--) {
        if (SortUtils.less(arr[j], arr[j - 1])) {
          SortUtils.swap(arr, j, j - 1);
        } else {
          break;
        }
      }
    }
  }

}

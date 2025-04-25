package main.module_05;

/**
 * In iteration i, find the index min of smallest remaining entry. Swap a[i]
 * with a[min]
 * 
 * Complexity is (N^2 / 2)
 */
public class SelectionSort {

  public void sort(Comparable[] arr) {

    int n = arr.length;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (SortUtils.less(arr[j], arr[i])) {
          SortUtils.swap(arr, i, j);
        }
      }
    }

  }

}

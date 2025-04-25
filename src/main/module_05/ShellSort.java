package main.module_05;

/**
 * This is similar to {@link InsertionSort} but here we swap elements by h
 * position. This helps because in each iteration, the array becomes partially
 * sorted. Thereby increasing the efficiency for Insertion Sort.
 * 
 * The worst case number of compares used by shellsort with 3x+1 increments is
 * O(N^(3/2)).
 */
public class ShellSort {

  public void sort(Comparable[] arr) {

    int n = arr.length;

    int h = 1;
    while (h < n / 3) {
      h = (3 * h) + 1; // 1, 4, 13, 40, 121.....
    }

    while (h >= 1) {
      for (int i = h; i < n; i++) {
        for (int j = i; j >= h; j = j - h) {
          if (SortUtils.less(arr[j], arr[j - h])) {
            SortUtils.swap(arr, j, j - h);
          }
        }
      }
      h = h / 3;
    }
  }

}

package main.module_07;

public class QuickSort {

  public void sort(Comparable[] arr) {

    sort(arr, 0, arr.length - 1);

  }

  private void sort(Comparable[] arr, int start, int end) {
    if (start >= end) {
      return;
    }

    int pivot = partition(arr, start, end);
    sort(arr, start, pivot - 1);
    sort(arr, pivot + 1, end);
  }

  private int partition(Comparable[] arr, int low, int high) {
    int i = low;
    int j = high;

    while (true) {
      while (SortUtils.less(arr[i], arr[low])) {
        i++;
        if (i == high) {
          break;
        }
      }

      while (SortUtils.less(arr[low], arr[j])) {
        j--;
        if (j == low) {
          break;
        }
      }

      if (i >= j) {
        break;
      }

      SortUtils.swap(arr, low, j);
    }
    return j;
  }

}

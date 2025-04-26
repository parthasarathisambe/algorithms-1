package main.module_06;

public class MergeSortWithRecurrsion {

  public void sort(Comparable[] arr) {

    int n = arr.length;
    Comparable[] aux = new Comparable[n];
    sort(arr, aux, 0, n - 1);

  }

  private void sort(Comparable[] arr, Comparable[] aux, int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;
    sort(arr, aux, 0, mid);
    sort(arr, aux, mid + 1, end);
    SortUtils.merge(arr, aux, start, mid, end);
  }

}

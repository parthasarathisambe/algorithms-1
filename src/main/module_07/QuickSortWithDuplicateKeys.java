package main.module_07;

public class QuickSortWithDuplicateKeys {

  public void sort(Comparable[] arr) {

    int n = arr.length;
    int low = 0;
    int high = n - 1;
    sort(arr, low, high);

  }

  private void sort(Comparable[] arr, int low, int high) {

    if (low >= high) {
      return;
    }

    int lt = low;
    int gt = high;
    int i = lt;

    Comparable pivot = arr[low];

    while (i <= gt) {

      int result = pivot.compareTo(arr[i]);

      if (result > 0) {
        swap(arr, lt, i);
        lt++;
        i++;
      } else if (result < 0) {
        swap(arr, i, gt);
        gt--;
      } else {
        i++;
      }

    }

    sort(arr, low, lt - 1);
    sort(arr, gt + 1, high);

  }

  private void swap(Comparable[] arr, int i, int j) {
    Comparable temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}

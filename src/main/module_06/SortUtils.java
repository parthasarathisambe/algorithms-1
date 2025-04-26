package main.module_06;

public class SortUtils {

  public static boolean less(Comparable a, Comparable b) {
    return a.compareTo(b) < 0;
  }

  public static void merge(Comparable[] arr, Comparable[] aux, int low, int mid, int high) {
    for (int i = low; i <= high; i++) {
      aux[i] = arr[i];
    }

    int p = low;
    int q = mid + 1;
    int curr = p;

    while (p <= mid && q <= high) {
      arr[curr++] = aux[less(aux[p], aux[q]) ? p++ : q++];
    }

    while (p <= mid) {
      arr[curr++] = aux[p++];
    }

    while (q <= high) {
      arr[curr++] = aux[q++];
    }
  }

}

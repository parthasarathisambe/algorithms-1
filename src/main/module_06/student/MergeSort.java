package main.module_06.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeSort {

  public <T> void sort(List<T> arr, Comparator<T> comparator) {

    int n = arr.size();
    List<T> aux = new ArrayList<>(Collections.nCopies(n, null));
    sort(arr, aux, 0, n - 1, comparator);

  }

  private <T> void sort(List<T> arr, List<T> aux, int start, int end, Comparator<T> comparator) {
    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;
    sort(arr, aux, start, mid, comparator);
    sort(arr, aux, mid + 1, end, comparator);
    merge(arr, aux, start, mid, end, comparator);
  }

  private static <T> void merge(List<T> arr, List<T> aux, int low, int mid, int high, Comparator<T> comparator) {
    for (int i = low; i <= high; i++) {
      aux.set(i, arr.get(i));
    }

    int p = low;
    int q = mid + 1;
    int curr = p;

    while (p <= mid && q <= high) {
      arr.set(curr++, aux.get(compare(aux.get(p), aux.get(q), comparator) ? p++ : q++));
    }

    while (p <= mid) {
      arr.set(curr++, aux.get(p++));
    }

    while (q <= high) {
      arr.set(curr++, aux.get(q++));
    }
  }

  private static <T> boolean compare(T a, T b, Comparator<T> comparator) {
    return comparator.compare(a, b) < 0;
  }

}

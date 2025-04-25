package main.module_05;

public class SortUtils {

  public static boolean less(Comparable first, Comparable second) {
    return first.compareTo(second) < 0;
  }

  public static void swap(Comparable[] arr, int i, int j) {
    Comparable temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  
}

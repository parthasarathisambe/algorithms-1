package main.module_06;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    Comparable[] arr = { 7, 10, 5, 3, 8, 4, 2, 9, 6 };
    System.out.println("Original Array: \t\t\t" + Arrays.toString(arr));
    new MergeSortWithRecurrsion().sort(arr);
    System.out.println("Array after Merge Sort (recursive): \t" + Arrays.toString(arr));

    System.out.println();

    Comparable[] arr1 = { 7, 10, 5, 3, 8, 4, 2, 9, 6 };
    System.out.println("Original Array: \t\t\t" + Arrays.toString(arr1));
    new MergeSortBottomUp().sort(arr1);
    System.out.println("Array after Merge Sort (iterative): \t" + Arrays.toString(arr1));
  }

}

package main.module_07;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    Comparable[] arr = {3,2,1,5,6,4};
    System.out.println("Original Array: \t\t" + Arrays.toString(arr));
    new QuickSort().sort(arr);
    System.out.println("Array after Quick Sort: \t" + Arrays.toString(arr));

    System.out.println();
    
    int[] arr1 = {3,2,1,5,6,4};
    System.out.println("Original Array: \t\t" + Arrays.toString(arr1));
    int k = 2;
    int ele = new KthLargestElementInArray().findKth(arr1, k);
    System.out.println(k + "th largest element in the Array is : \t" + ele);
    
    Comparable[] arr2 = {'P', 'A', 'B', 'X', 'W', 'P', 'P', 'V', 'P', 'D', 'P', 'C', 'Y', 'Z'};
    System.out.println("Original Array: \t\t" + Arrays.toString(arr2));
    new QuickSortWithDuplicateKeys().sort(arr2);
    System.out.println("Array after Quick Sort: \t" + Arrays.toString(arr2));
    
  }

}

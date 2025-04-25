package main.module_05;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    Comparable[] arr = { 7, 10, 5, 3, 8, 4, 2, 9, 6 };
    System.out.println("Original Array: \t\t" + Arrays.toString(arr));
    new SelectionSort().sort(arr);
    System.out.println("Array after Selection Sort: \t" + Arrays.toString(arr));

    System.out.println();

    new Shuffle().shuffle(arr);
    System.out.println("Original Array: \t\t" + Arrays.toString(arr));
    new InsertionSort().sort(arr);
    System.out.println("Array after Insertion Sort: \t" + Arrays.toString(arr));

    System.out.println();

    new Shuffle().shuffle(arr);
    System.out.println("Original Array: \t\t" + Arrays.toString(arr));
    new ShellSort().sort(arr);
    System.out.println("Array after Shell Sort: \t" + Arrays.toString(arr));

  }

}

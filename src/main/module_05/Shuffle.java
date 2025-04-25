package main.module_05;

import edu.princeton.cs.algs4.StdRandom;

public class Shuffle {

  public void shuffle(Comparable[] arr) {

    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int r = StdRandom.uniformInt(i + 1);
      SortUtils.swap(arr, i, r);
    }

  }

}

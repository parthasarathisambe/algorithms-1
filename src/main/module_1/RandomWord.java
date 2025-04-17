package main.module_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

  public static void main(String[] args) {

    String champion = null;
    int i = 2;

    while (!StdIn.isEmpty()) {
      if (StdRandom.bernoulli(1.0 / i)) {
        champion = StdIn.readString();
      }
      i++;
    }

    StdOut.println(champion);
  }

}

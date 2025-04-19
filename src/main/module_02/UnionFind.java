package main.module_02;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UnionFind {

  public static void main(String[] args) {

    int n = StdIn.readInt();
    UF_QuickUnion_Weighted uf = new UF_QuickUnion_Weighted(n);

    while (!StdIn.isEmpty()) {
      int p = StdIn.readInt();
      int q = StdIn.readInt();

      if (!uf.connected(p, q)) {
        uf.union(p, q);
      }

      StdOut.println(p + " " + q);
    }
  }

}

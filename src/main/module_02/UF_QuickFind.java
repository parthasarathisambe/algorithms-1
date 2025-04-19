package main.module_02;

/**
 * Please refer to 15UnionFind.pdf document in resources.module_02 folder for more details.
 * 
 * Input:
 * 10
 * 4, 3
 * 3, 8
 * 6, 5
 * 9, 4
 * 2, 1
 * 8, 9
 * 5, 0
 * 7, 2
 * 6, 1
 * 1, 0
 * 6, 7
 * 
 * Resultant Array will be:
 * [6, 6, 6, 9, 9, 6, 6, 6, 9, 9]
 */
public class UF_QuickFind {

  int n;
  int[] uf;

  public UF_QuickFind(int n) {
    this.n = n;
    uf = new int[n];
    for (int i = 0; i < n; i++) {
      uf[i] = i;
    }
  }

  void union(int p, int q) {
    int val = uf[q];
    for (int i = 0; i < n; i++) {
      if (uf[i] == val) {
        uf[i] = uf[p];
      }
    }
  }

  boolean connected(int p, int q) {
    return uf[p] == uf[q];
  }

  int find(int p) {
    return 0;
  }

  int count() {
    return 0;
  }

}

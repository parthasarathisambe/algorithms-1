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
 * [1, 1, 1, 8, 3, 0, 5, 1, 8, 8]
 */
public class UF_QuickUnion {

  int n;
  int[] uf;

  public UF_QuickUnion(int n) {
    this.n = n;
    uf = new int[n];
    for (int i = 0; i < n; i++) {
      uf[i] = i;
    }
  }

  public int getRoot(int r) {
    while (r != uf[r]) {
      r = uf[r];
    }
    return r;
  }

  void union(int p, int q) {
    int pRoot = getRoot(p);
    int qRoot = getRoot(q);
    uf[pRoot] = qRoot;
  }

  boolean connected(int p, int q) {
    return getRoot(p) == getRoot(q);
  }

  int find(int p) {
    return 0;
  }

  int count() {
    return 0;
  }

}

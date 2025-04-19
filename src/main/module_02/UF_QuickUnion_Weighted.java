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
 * [2, 2, 2, 8, 8, 0, 2, 2, 8, 8]
 * 
 * And the size array will be:
 * [1, 1, 4, 2, 2, 2, 2, 1, 1, 2]
 */
public class UF_QuickUnion_Weighted {

  int n;
  int[] uf;
  int[] sizeUf;

  public UF_QuickUnion_Weighted(int n) {
    this.n = n;
    uf = new int[n];
    sizeUf = new int[n];
    for (int i = 0; i < n; i++) {
      uf[i] = i;
      sizeUf[i] = 1;
    }

  }

  public int getRoot(int r) {
    while (r != uf[r]) {
      uf[r] = uf[uf[r]]; // path compression - flattening the tree for more optimization.
      r = uf[r];
    }
    return r;
  }

  void union(int p, int q) {
    int pRoot = getRoot(p);
    int qRoot = getRoot(q);

    if (sizeUf[pRoot] < sizeUf[qRoot]) {
      uf[pRoot] = qRoot;
      sizeUf[qRoot] += sizeUf[pRoot];
    } else {
      uf[qRoot] = pRoot;
      sizeUf[pRoot] += sizeUf[qRoot];
    }

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

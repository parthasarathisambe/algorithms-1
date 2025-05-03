package main.module_08;

public class HeapSort<T extends Comparable<T>> extends BinaryMaxHeap<T> {

  public HeapSort(int capacity) {
    super(capacity);
  }

  public void sort() {

    int p = index - 1;

    while (p > 0) {
      swap(1, p);
      sink(p - 1);
      p--;
    }

  }

}

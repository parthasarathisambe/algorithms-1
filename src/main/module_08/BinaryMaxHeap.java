package main.module_08;

import java.util.ArrayList;
import java.util.List;

public class BinaryMaxHeap<T extends Comparable<T>> {

  protected List<T> maxHeap;
  protected int size;
  protected int index;

  public BinaryMaxHeap(int capacity) {
    maxHeap = new ArrayList<>(capacity);
    for (int i = 0; i < capacity; i++) {
      maxHeap.add(null);
    }
    index = 1;
    size = 0;
  }

  public void insert(T key) {
    maxHeap.add(index, key);
    index++;
    size++;
    swim();
  }

  public T deleteMax() {
    T max = maxHeap.get(1);
    swap (1, index - 1);
    maxHeap.set(index - 1, null);
    size--;
    index--;
    sink(size);
    return max;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public T getMax() {
    return maxHeap.get(1);
  }

  public int size() {
    return size;
  }

  private void swim() {
    if (size == 1) {
      return;
    }
    int k = index - 1;
    while (k > 1 && less(k / 2, k)) {
      swap(k / 2, k);
      k = k / 2;
    }
  }

  protected void sink(int size) {
    int k = 1;

    while (2 * k <= size) {
      int j = 2 * k;
      if (j < size && less(j, j + 1)) {
         j++;
      } 
      
      if (less(j, k)) {
        break;
      }
      
      swap (k, j);
      k = j;
    }
  }
  
  protected boolean less(int i, int k) {
    return maxHeap.get(i).compareTo(maxHeap.get(k)) < 0;
  }

  protected void swap(int i, int j) {
    T temp = maxHeap.get(i);
    maxHeap.set(i, maxHeap.get(j));
    maxHeap.set(j, temp);
  }

}

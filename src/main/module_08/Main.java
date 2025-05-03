package main.module_08;

public class Main {

  public static void main(String[] args) {
    
    BinaryMaxHeap<Integer> maxHeap = new BinaryMaxHeap<>(11);
    maxHeap.insert(29);
    maxHeap.insert(16);
    maxHeap.insert(30);
    maxHeap.insert(25);
    System.out.println("Max Heap Value is: " + maxHeap.getMax());
    maxHeap.insert(24);
    maxHeap.insert(9);
    maxHeap.insert(27);
    maxHeap.insert(34);
    System.out.println("Max Heap Value is: " + maxHeap.getMax());
    maxHeap.insert(17);
    maxHeap.insert(22);
    System.out.println("Max Heap Value is: " + maxHeap.getMax());
    System.out.println("Size of the Max Heap is: " + maxHeap.size());
    System.out.println("Removing max value: " + maxHeap.deleteMax() + ". Current max is: " + maxHeap.getMax());
    System.out.println("Removing max value: " + maxHeap.deleteMax() + ". Current max is: " + maxHeap.getMax());
    System.out.println("Removing max value: " + maxHeap.deleteMax() + ". Current max is: " + maxHeap.getMax());
    System.out.println("Removing max value: " + maxHeap.deleteMax() + ". Current max is: " + maxHeap.getMax());
    System.out.println("Removing max value: " + maxHeap.deleteMax() + ". Current max is: " + maxHeap.getMax());
    System.out.println("Removing max value: " + maxHeap.deleteMax() + ". Current max is: " + maxHeap.getMax());
    System.out.println("Removing max value: " + maxHeap.deleteMax() + ". Current max is: " + maxHeap.getMax());
    System.out.println("Removing max value: " + maxHeap.deleteMax() + ". Current max is: " + maxHeap.getMax());
    System.out.println("Removing max value: " + maxHeap.deleteMax() + ". Current max is: " + maxHeap.getMax());
    System.out.println("Removing max value: " + maxHeap.deleteMax() + ". Current max is: " + maxHeap.getMax());
    System.out.println("Is Max heap empty now? " + maxHeap.isEmpty());
    
    HeapSort<String> maxHeapForSort = new HeapSort<>(11);
    maxHeapForSort.insert("S");
    maxHeapForSort.insert("O");
    maxHeapForSort.insert("R");
    maxHeapForSort.insert("T");
    maxHeapForSort.insert("E");
    maxHeapForSort.insert("X");
    maxHeapForSort.insert("A");
    maxHeapForSort.insert("M");
    maxHeapForSort.insert("P");
    maxHeapForSort.insert("L");
    maxHeapForSort.insert("E");
    System.out.println("Unsorted Heap is: " + maxHeapForSort.maxHeap);
    maxHeapForSort.sort();
    System.out.println("Sorted Heap is: " + maxHeapForSort.maxHeap);
  }
  
}

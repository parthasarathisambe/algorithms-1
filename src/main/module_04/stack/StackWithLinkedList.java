package main.module_04.stack;

public class StackWithLinkedList<T> {

  StackNode<T> first;
  int size = 0;

  public StackWithLinkedList() {
    first = new StackNode<>();
  }

  public void push(T item) {
    StackNode<T> node = new StackNode<>(item);
    node.next = first;
    first = node;
    size++;
  }

  public T pop() {
    T item = first.item;
    first = first.next;
    size--;
    return item;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

}

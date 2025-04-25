package main.module_04.queue;

import main.module_04.stack.StackWithLinkedList;

public class QueueImplWithTwoStacks<T> {

  StackWithLinkedList<T> stackEnq;
  StackWithLinkedList<T> stackDeq;
  int size;

  public QueueImplWithTwoStacks() {
    stackEnq = new StackWithLinkedList<>();
    stackDeq = new StackWithLinkedList<>();
  }

  public void enqueue(T item) {
    stackEnq.push(item);
    size++;
  }

  public T dequeue() {
    if (stackDeq.isEmpty()) {
      while (!stackEnq.isEmpty()) {
        stackDeq.push(stackEnq.pop());
      }
    }
    size--;
    return stackDeq.pop();
  }

  public boolean isEmpty() {
    return stackEnq.isEmpty() && stackDeq.isEmpty();
  }

  public int size() {
    return size;
  }

}

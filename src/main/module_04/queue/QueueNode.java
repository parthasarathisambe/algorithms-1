package main.module_04.queue;

public class QueueNode<T> {

  T item;

  QueueNode<T> next;

  public QueueNode() {

  }

  public QueueNode(T item) {
    this.item = item;
    this.next = null;
  }

}

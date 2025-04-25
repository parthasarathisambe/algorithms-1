package main.module_04.queue;

public class QueueWithLinkedList {

  QueueNode first;
  QueueNode last;
  int size = 0;

  public QueueWithLinkedList() {
    first = new QueueNode();
    last = new QueueNode();
  }

  public void enqueue(String item) {
    QueueNode node = new QueueNode(item);
    last.next = node;
    last = node;
    size++;
    if (isEmpty()) {
      first = last;
    }
  }

  public String dequeue() {
    String item = first.item;
    first = first.next;
    size--;
    if (isEmpty()) {
      last = first;
    }
    return item;
  }

  public boolean isEmpty() {
    return first == null || first.item == null;
  }

  public int size() {
    return size;
  }

}

package main.module_04.queue;

import java.util.Iterator;
import java.util.Objects;

public class QueueWithLinkedList<T> implements Iterable<T> {

  QueueNode<T> first;
  QueueNode<T> last;
  int size = 0;

  public QueueWithLinkedList() {
    first = new QueueNode<>();
    last = new QueueNode<>();
  }

  public void enqueue(T item) {
    QueueNode<T> node = new QueueNode<>(item);
    last.next = node;
    last = node;
    size++;
    if (isEmpty()) {
      first = last;
    }
  }

  public T dequeue() {
    T item = first.item;
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

  @Override
  public Iterator<T> iterator() {
    return new QueueIterator();
  }

  private class QueueIterator implements Iterator<T> {
    QueueNode<T> curr = first;

    @Override
    public boolean hasNext() {
      return Objects.nonNull(curr);
    }

    @Override
    public T next() {
      QueueNode<T> temp = curr;
      curr = curr.next;
      return temp.item;
    }
  }

}

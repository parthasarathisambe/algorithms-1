package main.module_04.queue;

public class QueueNode {

  String item;

  QueueNode next;

  public QueueNode() {

  }

  public QueueNode(String item) {
    this.item = item;
    this.next = null;
  }

}

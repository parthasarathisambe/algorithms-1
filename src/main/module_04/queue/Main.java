package main.module_04.queue;

public class Main {

  public static void main(String[] args) {
    queueWithLinkedList();
    System.out.println();
    queueWithTwoStacks();
  }

  private static void queueWithLinkedList() {
    System.out.println("***** Queue implementation with Linked List *****");
    QueueWithLinkedList queue = new QueueWithLinkedList();

    queue.enqueue("ek");
    queue.enqueue("do");
    queue.enqueue("teen");
    queue.enqueue("char");

    System.out.println("Size of the queue after 4 items is: " + queue.size());
    System.out.println("Is queue empty? " + queue.isEmpty());
    System.out.println("Removing queue items one by one:");

    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());

    System.out.println("Is queue empty? " + queue.isEmpty());
  }

  private static void queueWithTwoStacks() {
    System.out.println("***** Queue implementation with two stacks *****");
    QueueImplWithTwoStacks<String> queue = new QueueImplWithTwoStacks<>();

    queue.enqueue("ek");
    queue.enqueue("do");
    queue.enqueue("teen");
    queue.enqueue("char");

    System.out.println("Size of the queue after 4 items is: " + queue.size());
    System.out.println("Is queue empty? " + queue.isEmpty());
    System.out.println("Removing queue items one by one:");

    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());

    System.out.println("Is queue empty? " + queue.isEmpty());
  }

}

package main.module_04.stack;

public class StackNode<T> {

  T item;

  StackNode<T> next;

  public StackNode() {
    
  }
  
  public StackNode(T item) {
    this.item = item;
    this.next = null;
  }

}

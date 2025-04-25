package main.module_04.generics;

public class Box<T> {

  private T item;

  public void setItem(T item) {
    this.item = item;
  }

  public T getItem() {
    return item;
  }

}

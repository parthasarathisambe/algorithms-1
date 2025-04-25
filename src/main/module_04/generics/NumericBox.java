package main.module_04.generics;

public class NumericBox<T extends Number> {

  private T number;

  public void setNumber(T number) {
    this.number = number;
  }

  public T getNumber() {
    return number;
  }

}

package main.module_04.stack;

public class StackWithResizingArrays {

  String[] arr;
  int pointer;

  public StackWithResizingArrays() {
    arr = new String[1];
    pointer = 0;
  }

  public void push(String item) {
    arr[pointer++] = item;
    if (pointer == arr.length) {
      arr = resizeTheArray(arr.length * 2);
    }
  }

  public String pop() {
    String item = arr[--pointer];
    arr[pointer] = null;
    if (pointer == arr.length / 4) {
      arr = resizeTheArray(arr.length / 2);
    }
    return item;
  }

  public boolean isEmpty() {
    return pointer == 0;
  }

  public int size() {
    return pointer;
  }

  private String[] resizeTheArray(int size) {
    String[] newArr = new String[size];
    for (int i = 0; i < pointer; i++) {
      newArr[i] = arr[i];
    }
    return newArr;
  }

}

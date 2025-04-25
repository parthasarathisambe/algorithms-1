package main.module_04.generics;

public class Main {

  public static void main(String[] args) {
    
    Box<String> stringBox = new Box<>();
    stringBox.setItem("string item");
    System.out.println(stringBox.getItem());
    
    Box<Integer> integerBox = new Box<>();
    integerBox.setItem(10);
    System.out.println(integerBox.getItem());
    
    Utils.printItem(stringBox.getItem());
    Utils.printItem(integerBox.getItem());
    
    NumericBox<Float> numericBox = new NumericBox<>();
    numericBox.setNumber(10.0f);
    System.out.println(numericBox.getNumber());
  }
  
}

package main.module_04.stack;

public class Main {

  public static void main(String[] args) {

    StackWithLinkedList<String> stack = new StackWithLinkedList<>();
//    StackWithResizingArrays stack = new StackWithResizingArrays();

    stack.push("ek");
    stack.push("do");
    stack.push("teen");
    stack.push("char");

    System.out.println("Size of the stack after 4 items is: " + stack.size());
    System.out.println("Is stack empty? " + stack.isEmpty());
    System.out.println("Removing stack items one by one:");

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

    System.out.println("Is stack empty? " + stack.isEmpty());

    String expression = "(1+((2+3)*(4*5)))";
    System.out.println("Result of " + expression + " = " + new ArithmaticExpressionEvaluation().evaluate(expression));
  }

}

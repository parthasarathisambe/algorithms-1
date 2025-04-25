package main.module_04.stack;

public class ArithmaticExpressionEvaluation {

  public double evaluate(String expression) {

    StackWithLinkedList<Character> opers = new StackWithLinkedList<>();
    StackWithLinkedList<Double> vals = new StackWithLinkedList<>();

    for (int i = 0; i < expression.length(); i++) {
      char value = expression.charAt(i);

      if ('(' == value) {
        continue;
      } else if ('+' == value || '-' == value || '*' == value || '/' == value) {
        opers.push(value);
      } else if (Character.isDigit(value)) {
        vals.push(Double.valueOf(Character.getNumericValue(value)));
      } else if (')' == value) {
        vals.push(compute(vals.pop(), opers.pop(), vals.pop()));
      }
    }

    return vals.pop();
  }

  private Double compute(Double num1, Character oper, Double num2) {
    return switch (oper) {
      case '+' -> num2 + num1;
      case '-' -> num2 - num1;
      case '*' -> num2 * num1;
      case '/' -> num2 / num1;
      default -> 0.0;
    };
  }

}

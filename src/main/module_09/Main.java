package main.module_09;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {

    SymbolTable<Character, Integer> symbolTable = new SymbolTable<>();
    symbolTable.put('S', 0);
    symbolTable.put('E', 1);
    symbolTable.put('A', 2);
    symbolTable.put('R', 3);
    symbolTable.put('C', 4);
    symbolTable.put('H', 5);
    symbolTable.put('E', 6);
    symbolTable.put('X', 7);
    symbolTable.put('A', 8);
    symbolTable.put('M', 9);
    symbolTable.put('P', 10);
    symbolTable.put('L', 11);
    symbolTable.put('E', 12);

    symbolTable.print();
    System.out.println("Size of Symbol Table: " + symbolTable.size());

    symbolTable.delete('E');
    symbolTable.delete('L');
    symbolTable.delete('P');

    symbolTable.print();
    System.out.println("Size of Symbol Table: " + symbolTable.size());

    System.out.println("Does Symbol Table has key 'R': " + (symbolTable.contains('R') ? "Yes" : "No"));
    System.out.println("Size of Symbol Table: " + symbolTable.size());

    System.out.println("First element: " + symbolTable.min());
    System.out.println("Last element: " + symbolTable.max());
    System.out.println("Ceiling of 'N': " + symbolTable.ceiling('N'));
    System.out.println("Floor of 'D': " + symbolTable.floor('D'));
    System.out.println("Rank of 'S': " + symbolTable.rank('S'));

    symbolTable.deleteMin();
    symbolTable.deleteMax();
    System.out.println("Symbol Table after deleting min and max elements:");
    symbolTable.print();

    System.out.println();
  }
}

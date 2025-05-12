package main.module_09.binary_search_trees;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {

    BinarySearchTree<Character, Integer> binarySearchTree = getCharacterIntegerBinarySearchTree();

    binarySearchTree.print();

    print("Value of R is: " + binarySearchTree.get('R'));
    print("Floor value of N is: " + binarySearchTree.getFloor('N'));
    print("Ceiling value of D is: " + binarySearchTree.getCeiling('D'));
    print("Rank of X is: " + binarySearchTree.rank('X'));
    binarySearchTree.deleteMin();
    binarySearchTree.delete('R');
    binarySearchTree.delete('S');
    binarySearchTree.delete('H');
    binarySearchTree.delete('L');
    binarySearchTree.delete('E');
    binarySearchTree.deleteMin();
    binarySearchTree.print();
    Iterator<Character> iterator = binarySearchTree.iterator();
    print("Printing remaining elements in order:");
    iterator.forEachRemaining(key -> print(String.valueOf(key)));

  }

  private static BinarySearchTree<Character, Integer> getCharacterIntegerBinarySearchTree() {
    BinarySearchTree<Character, Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.put('S', 0);
    binarySearchTree.put('E', 1);
    binarySearchTree.put('A', 2);
    binarySearchTree.put('R', 3);
    binarySearchTree.put('C', 4);
    binarySearchTree.put('H', 5);
    binarySearchTree.put('E', 6);
    binarySearchTree.put('X', 7);
    binarySearchTree.put('A', 8);
    binarySearchTree.put('M', 9);
    binarySearchTree.put('P', 10);
    binarySearchTree.put('L', 11);
    binarySearchTree.put('E', 12);
    return binarySearchTree;
  }

  private static void print(String binarySearchTree) {
    System.out.println(binarySearchTree);
  }

}

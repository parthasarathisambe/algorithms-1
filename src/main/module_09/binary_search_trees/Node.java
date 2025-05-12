package main.module_09.binary_search_trees;

public class Node<Key, Value> {

  private Key key;
  private Value value;
  private Node<Key, Value> left;
  private Node<Key, Value> right;
  private int count;

  public Node(Key key, Value value, int count) {
    this.key = key;
    this.value = value;
    this.count = count;
  }

  public void setKey(Key key) {
    this.key = key;
  }

  public Key getKey() {
    return key;
  }

  public void setValue(Value value) {
    this.value = value;
  }

  public Value getValue() {
    return value;
  }

  public void setLeft(Node<Key, Value> left) {
    this.left = left;
  }

  public Node<Key, Value> getLeft() {
    return left;
  }

  public void setRight(Node<Key, Value> right) {
    this.right = right;
  }

  public Node<Key, Value> getRight() {
    return right;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getCount() {
    return count;
  }

}

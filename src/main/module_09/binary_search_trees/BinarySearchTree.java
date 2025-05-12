package main.module_09.binary_search_trees;

import main.module_04.queue.QueueWithLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

  private Node<Key, Value> root;

  public void put(Key key, Value value) {
    root = put(root, key, value);
  }

  private Node<Key, Value> put(Node<Key, Value> node, Key key, Value value) {
    if (Objects.isNull(node)) {
      return new Node<>(key, value, 1);
    }

    int cmp = key.compareTo(node.getKey());

    if (cmp > 0) {
      node.setRight(put(node.getRight(), key, value));
    } else if (cmp < 0) {
      node.setLeft(put(node.getLeft(), key, value));
    } else {
      node.setValue(value);
    }
    node.setCount(1 + size(node.getLeft()) + size(node.getRight()));
    return node;
  }

  public Value get(Key key) {
    Node<Key, Value> node = root;
    while (Objects.nonNull(root)) {
      if (node.getKey().compareTo(key) < 0) {
        node = node.getRight();
      } else if (node.getKey().compareTo(key) > 0) {
        node = node.getLeft();
      } else {
        return node.getValue();
      }
    }
    throw new NoSuchElementException(key + " not found.");
  }

  public Key getFloor(Key key) {
    Node<Key, Value> node = root;

    Key floorKey = null;
    while (Objects.nonNull(node)) {
      if (node.getKey().compareTo(key) < 0) {
        floorKey = node.getKey();
        node = node.getRight();
      } else if (node.getKey().compareTo(key) > 0) {
        node = node.getLeft();
      } else {
        floorKey = node.getKey();
        break;
      }
    }

    if (Objects.nonNull(floorKey)) {
      return floorKey;
    } else {
      throw new NoSuchElementException("Floor value for the key: " + key + " doesn't exist");
    }
  }

  public Key getCeiling(Key key) {
    Node<Key, Value> node = root;

    Key ceilingKey = null;
    while (Objects.nonNull(node)) {
      if (node.getKey().compareTo(key) < 0) {
        node = node.getRight();
      } else if (node.getKey().compareTo(key) > 0) {
        ceilingKey = node.getKey();
        node = node.getLeft();
      } else {
        ceilingKey = node.getKey();
        break;
      }
    }

    if (Objects.nonNull(ceilingKey)) {
      return ceilingKey;
    } else {
      throw new NoSuchElementException("Floor value for the key: " + key + " doesn't exist");
    }
  }

  public int size() {
    return size(root);
  }

  public int size(Node<Key, Value> node) {
    return Objects.nonNull(node) ? node.getCount() : 0;
  }

  public int rank(Key key) {
    return rank(root, key);
  }

  private int rank(Node<Key, Value> node, Key key) {
    if (node == null) {
      return 0;
    }

    if (node.getKey().compareTo(key) < 0) {
      return 1 + size(node.getLeft()) + rank(node.getRight(), key);
    } else if (node.getKey().compareTo(key) > 0) {
      return rank(node.getLeft(), key);
    } else {
      return size(node.getLeft());
    }
  }

  public void delete(Key key) {
    root = delete(root, key);
  }

  private Node<Key, Value> delete(Node<Key, Value> node, Key key) {
    if (Objects.isNull(node)) {
      return null;
    }

    if (node.getKey().compareTo(key) < 0) {
      node.setRight(delete(node.getRight(), key));
    } else if (node.getKey().compareTo(key) > 0) {
      node.setLeft(delete(node.getLeft(), key));
    } else {

      if (Objects.isNull(node.getRight())) {
        return node.getLeft();
      }

      if (Objects.isNull(node.getLeft())) {
        return node.getRight();
      }

      Node<Key, Value> x = node;
      node = getMin(x.getRight());
      node.setRight(deleteMin(x.getRight()));
      node.setLeft(x.getLeft());
    }
    node.setCount(1 + size(node.getLeft()) + size(node.getRight()));
    return node;
  }

  public Iterator<Key> iterator() {
    QueueWithLinkedList<Key> queue = new QueueWithLinkedList<>();
    Node<Key, Value> node = root;
    inorder(node, queue);
    return queue.iterator();
  }

  private void inorder(Node<Key, Value> node, QueueWithLinkedList<Key> queue) {

    if (Objects.isNull(node)) {
      return;
    }

    inorder(node.getLeft(), queue);
    queue.enqueue(node.getKey());
    inorder(node.getRight(), queue);
  }

  public void deleteMin() {
    root = deleteMin(root);
  }

  private Node<Key, Value> deleteMin(Node<Key, Value> node) {
    if (Objects.isNull(node.getLeft())) {
      return node.getRight();
    }
    node.setLeft(deleteMin(node.getLeft()));
    node.setCount(1 + size(node.getLeft()) + size(node.getRight()));
    return node;
  }

  public Node<Key, Value> getMin(Node<Key, Value> node) {
    Node<Key, Value> min = node;
    while (Objects.nonNull(min.getLeft())) {
      min = (min.getLeft());
    }
    return min;
  }

  public void print() {
    Node<Key, Value> node = root;
    print(node);
  }

  private void print(Node<Key, Value> node) {
    if (Objects.isNull(node)) {
      return;
    }

    // Print root node
    System.out.println("Root Node: " + node.getKey());

    // Print left and right children with better structure
    String leftKey = (Objects.nonNull(node.getLeft())) ? String.valueOf(node.getLeft().getKey()) : "null";
    String rightKey = (Objects.nonNull(node.getRight())) ? String.valueOf(node.getRight().getKey()) : "null";

    System.out.println("   / \\");
    System.out.println(" " + leftKey + "   " + rightKey);

    // Recursively process children
    print(node.getLeft());
    print(node.getRight());
  }

}

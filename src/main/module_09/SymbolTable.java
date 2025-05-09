package main.module_09;

import java.util.*;

public class SymbolTable <Key extends Comparable<Key>, Value> {

  int size;
  List<Key> keys;
  List<Value> values;

  /**
   * Initialize SymbolTable.
   */
  SymbolTable() {
    keys = new ArrayList<>();
    values = new ArrayList<>();
  }

  /**
   * Put key-value pair into the table.
   */
  void put(Key key, Value val) {
      int index = getIndex(key);
      if (index < size && key.compareTo(keys.get(index)) == 0) {
        values.set(index, val);
        return;
      }
        keys.add(index, key);
        values.add(index, val);
        size++;
  }

  /**
   * Value paired with the key (null if absent).
   */
  Value get(Key key) {
    int index = getIndex(key);
    if (keys.get(index) == key) {
      return values.get(index);
    }
    return null;
  }

  /**
   * Remove key (and its value) from the table.
   */
  void delete(Key key) {
    if (Objects.nonNull(get(key))) {
      int index = keys.indexOf(key);
      keys.remove(index);
      values.remove(index);
      size--;
    }
  }

  /**
   * Is there a value paired with the key.
   */
  boolean contains(Key key) {
    return Objects.nonNull(get(key));
  }

  /**
   * Is the table empty?
   */
  boolean isEmpty() {
    return size == 0;
  }

  /**
   * Number of key-value pairs.
   */
  int size() {
    return size;
  }

  /**
   * Smallest key.
   */
  Key min() {
    throwExceptionForEmptyTable();
    return keys.getFirst();
  }

  /**
   * Largest key.
   */
  Key max() {
    throwExceptionForEmptyTable();
    return keys.get(size - 1);
  }

  /**
   * Largest key less than or equals key.
   */
  Key floor(Key key) {
    int keyIndex = getIndex(key);
    if (keyIndex == 0) {
      return keys.getFirst();
    }
    return keys.get(--keyIndex);
  }

  /**
   * Smallest key greater than or equals key.
   */
  Key ceiling(Key key) {
    int keyIndex = getIndex(key);
    return keys.get(keyIndex);
  }

  /**
   * Number of keys less than key.
   */
  int rank(Key key) {
    if (Objects.isNull(get(key))) {
      throwKeyNotFoundException();
    }
    return keys.indexOf(key) + 1;
  }

  /**
   * Delete the smallest key.
   */
  void deleteMin() {
    keys.removeFirst();
    values.removeFirst();
    size--;
  }

  /**
   * Delete the largest key.
   */
  void deleteMax() {
    keys.removeLast();
    values.removeLast();
    size--;
  }

  /**
   * Number of keys in [lo..hi]
   */
  int size(Key lo, Key hi) {
    return getIndex(hi) - getIndex(lo) + 1;
  }

  /**
   * Keys in [lo..hi], in sorted order.
   */
  Iterator<Key> keys(Key lo, Key hi) {
    int lowIndex = getIndex(lo);
    int hiIndex = getIndex(hi);

    return new Iterator<Key>() {
      int start = lowIndex;
      final int end = Math.min(hiIndex, size);

      @Override
      public boolean hasNext() {
        return start < end;
      }

      @Override
      public Key next() {
        if (!hasNext()) {
          throw new NoSuchElementException();
        }
        return keys.get(start++);
      }
    };
  }

  /**
   * All keys in the table, in sorted order.
   */
  Iterator<Key> keys() {
    return keys.iterator();
  }

  void print() {
    System.out.println("Printing Symbol Table:");
    System.out.println("_________________________");
    System.out.println("|\tKeys\t|\tValues\t|");
    System.out.println("|-----------|-----------|");
    keys().forEachRemaining(key -> System.out.println("|\t  " + key + "  \t|\t  " + get(key) + "  \t|"));
    System.out.println("|-----------|-----------|");
  }

  private int getIndex(Key key) {
    int first = 0;
    int last = keys.size() - 1;

    int index = 0;
    while (first <= last) {
      index = (first + last) / 2;
      if (keys.get(index).compareTo(key) < 0) {
        first = index + 1;
      } else if (keys.get(index).compareTo(key) > 0){
        last = index - 1;
      } else {
        return index;
      }
    }
    return first;
  }

  private void throwExceptionForEmptyTable() {
    if (isEmpty()) {
      throw new UnsupportedOperationException("Symbol Table is empty.");
    }
  }

  private void throwKeyNotFoundException() {
    throw new UnsupportedOperationException("Key doesn't exist in Symbol Table.");
  }

}

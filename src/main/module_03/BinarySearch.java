package main.module_03;

public class BinarySearch {

  public boolean findElement(int[] sortedArray, int x) {

    int i = 0;
    int j = sortedArray.length - 1;

    while (i <= j) {
      int mid = (i + j) / 2;
      int midEle = sortedArray[mid];
      if (x == midEle) {
        return true;
      } else if (x < midEle) {
        j = mid - 1;
      } else {
        i = mid + 1;
      }
    }

    return false;

  }

}

package main.module_04.generics;

import java.util.List;

public class WildCards {

  public void printList(List<?> list) {

    for (Object obj : list) {
      System.out.println(obj);
    }

  }

}

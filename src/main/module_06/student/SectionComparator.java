package main.module_06.student;

import java.util.Comparator;

public class SectionComparator implements Comparator<Student> {

  @Override
  public int compare(Student first, Student second) {
    return first.getSection() - second.getSection();
  }

}

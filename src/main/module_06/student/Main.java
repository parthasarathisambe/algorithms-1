package main.module_06.student;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Student s0 = new Student("Pandu", 1);
    Student s1 = new Student("Sony", 1);
    Student s2 = new Student("Kavita", 4);
    Student s3 = new Student("Sunny", 3);
    Student s4 = new Student("Bunny", 3);
    Student s5 = new Student("Amar", 3);
    Student s6 = new Student("Chitti", 4);
    Student s7 = new Student("Jillu", 2);
    Student s8 = new Student("Goutami", 2);
    Student s9 = new Student("Pari", 1);

    List<Student> students = Arrays.asList(s0, s1, s2, s3, s4, s5, s6, s7, s8, s9);

    Main obj = new Main();

    System.out.println("Before sorting students: ");
    obj.printStudents(students);

    System.out.println();

    MergeSort mergeSort = new MergeSort();

    System.out.println("After sorting students by name: ");
    mergeSort.sort(students, new NameComparator());
    obj.printStudents(students);

    System.out.println();

    System.out.println("After sorting students by section: ");
    mergeSort.sort(students, new SectionComparator());
    obj.printStudents(students);

  }

  private void printStudents(List<Student> students) {
    students.forEach(s -> System.out.println("Name: " + s.getName() + "\t Section: " + s.getSection()));
  }

}

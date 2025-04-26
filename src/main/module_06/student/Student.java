package main.module_06.student;

public class Student {

  private String name;

  private int section;

  public Student(String name, int section) {
    this.name = name;
    this.section = section;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSection() {
    return section;
  }

  public void setSection(int section) {
    this.section = section;
  }

}

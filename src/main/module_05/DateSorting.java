package main.module_05;

public class DateSorting implements Comparable<main.module_05.DateSorting.Date> {

  final int day;
  final int month;
  final int year;

  public DateSorting(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override
  public int compareTo(Date that) {
    if (that.year < this.year) {
      return -1;
    }
    if (that.year > this.year) {
      return 1;
    }
    if (that.month < this.month) {
      return -1;
    }
    if (that.month > this.month) {
      return 1;
    }
    if (that.day < this.day) {
      return -1;
    }
    if (that.day > this.day) {
      return 1;
    }
    return 0;
  }

  class Date {
    int day;
    int month;
    int year;
  }

}

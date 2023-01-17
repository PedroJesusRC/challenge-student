package com.pjrc.challengestudent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class Student {

  String name;
  Integer age;
  LocalDate endDate;
  List<Subject> subjects;

  public String getDayAndMonthOfEndDate() {
    return null;
  }

  public String getName() {
    return null;
  }

  public Integer getAge() {
    return null;
  }

  public LocalDate getEndDate() {
    return null;
  }

  public List<Subject> getSubjects() {
    ArrayList<Subject> subjects = new ArrayList<>();
    subjects.add(new Subject(null, null));
    return subjects;
  }

}

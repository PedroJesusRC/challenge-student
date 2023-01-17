package com.pjrc.challengestudent;

import java.time.LocalDate;
import java.util.List;
import lombok.Value;

@Value
class Student {

  String name;
  Integer age;
  LocalDate endDate;
  List<Subject> subjects;

  public String getDayAndMonthOfEndDate() {
    return endDate.getDayOfMonth() + "-" + endDate.getMonthValue();
  }

}

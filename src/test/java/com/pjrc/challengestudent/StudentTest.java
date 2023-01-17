package com.pjrc.challengestudent;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StudentTest {

  private Student student;
  private Subject subject;

  @BeforeEach
  public void setup() {

    subject = new Subject(
        "Math",
        9.5
    );

    student = new Student(
        "Pedro Aguilar",
        40,
        LocalDate.of(2023, 1, 16),
        List.of(subject)
    );
  }

  @Test
  void getStudentNameTest() {
    assertEquals("Pedro Aguilar", student.getName());
  }

  @Test
  void getStudentAgeTest() {
    assertEquals(40, student.getAge());
  }

  @Test
  void getEndDateTest() {
    assertEquals(LocalDate.of(2023, 1, 16), student.getEndDate());
  }

  @Test
  void getDayAndMonthOfEndDateTest() {
    assertEquals("16-1", student.getDayAndMonthOfEndDate());
  }

  @Test
  void getSubjectTest() {
    assertEquals(subject, student.getSubjects().get(0));
  }

  @Test
  void addNewSubjectToStudentSubjectsTest() {
    assertThrows(UnsupportedOperationException.class, () -> student.getSubjects().add(subject));
  }

  @Test
  void getSubjectNameTest() {
    assertEquals("Math", student.getSubjects().get(0).getName());
  }

  @Test
  void getSubjectGradeTest() {
    assertEquals(9.5, student.getSubjects().get(0).getGrade());
  }

}

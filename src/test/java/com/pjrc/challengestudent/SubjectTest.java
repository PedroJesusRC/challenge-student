package com.pjrc.challengestudent;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SubjectTest {

  private Subject subject;

  @BeforeEach
  public void setup() {

    subject = new Subject(
        "Math",
        9.5
    );
  }

  @Test
  void getNameTest() {
    assertEquals("Math", subject.getName());
  }

  @Test
  void getGradeTest() {
    assertEquals(9.5, subject.getGrade());
  }

}

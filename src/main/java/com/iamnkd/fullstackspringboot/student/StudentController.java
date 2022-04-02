package com.iamnkd.fullstackspringboot.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = Arrays.asList(
                new Student(1L, "Chris Ronald", "chris.ronald@org.com", Gender.MALE),
                new Student(2L, "Gabbie Carter", "gabbie.carter@org.com", Gender.FEMALE)
        );
        return students;
    }
}

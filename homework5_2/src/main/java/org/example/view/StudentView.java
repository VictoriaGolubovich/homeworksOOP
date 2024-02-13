package org.example.view;

import org.example.model.Student;

public class StudentView implements View<Student> {

    @Override
    public void print(Student student) {
        System.out.println(student);
    }
}
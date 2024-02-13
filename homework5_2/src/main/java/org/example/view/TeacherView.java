package org.example.view;

import org.example.model.Teacher;


public class TeacherView implements View<Teacher>{
    @Override
    public void print(Teacher teacher) {
        System.out.println(teacher);
    }
}
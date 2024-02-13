package org.example.service;

import org.example.model.Teacher;

public class TeacherService implements Service<Teacher>{
    private static int teacherIndex;
    static {
        teacherIndex = 0;
    }

    private Teacher teacher;
    @Override
    public void create(Teacher user) {
        user.setTeacherId(teacherIndex++);
        teacher = user;

    }

    @Override
    public Teacher read(int id) {
        return teacher;
    }
}

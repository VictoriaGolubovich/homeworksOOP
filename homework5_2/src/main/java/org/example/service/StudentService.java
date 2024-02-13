package org.example.service;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements Service<Student> {

    List<Student> studentsList;
    private static int studentIndex;

    static {
        studentIndex = 0;
    }

    public List<Student> getStudentList() {
        return studentsList;
    }

    public StudentService(){ studentsList = new ArrayList<>();}

    public StudentService(List<Student> studentsList){
        this.studentsList = studentsList;
    }

    @Override
    public void create(Student user) {
        user.setStudentId(studentIndex++);
        studentsList.add(user);
    }

    @Override
    public Student read(int id) {
        for (Student user : studentsList) {
            if (user.getStudentId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}

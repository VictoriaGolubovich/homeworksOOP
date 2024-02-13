package org.example.model;

import java.util.List;


public class StudyGroup implements Education{
    private Teacher teacher;
    private List<Student> studentList;


    public StudyGroup() {
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
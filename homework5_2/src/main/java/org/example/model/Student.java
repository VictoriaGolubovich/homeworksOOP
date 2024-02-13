package org.example.model;

public class Student extends User {
    private Integer studentId;

    public Student(String name, Integer age) {
        super(age, name);
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name=" + name +
                ", age=" + age +
                '}';
    }
}
package org.example.model;

public class Teacher extends User{
    private Integer teacherId;

    public Teacher(String name, Integer age) {
        super(age, name);

    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name=" + name +
                ", age=" + age +
                '}';
    }
}
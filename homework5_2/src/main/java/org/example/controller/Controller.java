package org.example.controller;

import org.example.model.Student;
import org.example.model.StudyGroup;
import org.example.model.Teacher;
import org.example.service.StudentService;
import org.example.service.StudyGroupService;
import org.example.service.TeacherService;
import org.example.view.StudentView;
import org.example.view.TeacherView;
import org.example.view.View;

import java.util.ArrayList;

public class Controller {
    private StudyGroupService service;
    private View view;

    public Controller(){
        this.service = service;
        this.view = view;
    }

    public void start() {
        StudentService studentsService = setStudents();
        TeacherService teacherService = setTeacher();
        service = new StudyGroupService();
        service.create(new StudyGroup());
        service.setTeacher(teacherService, 0);
        service.setStudentsList(studentsService);
        StudentView studentView = new StudentView();
        TeacherView teacherView = new TeacherView();

        System.out.println("Преподаватель:");
        teacherView.print(teacherService.read(getIdTeacher()));
        System.out.println("Студенты:");

        for (Integer i : getStudentsId()) {
            studentView.print(studentsService.read(i));
        }

    }
    private StudentService setStudents() {
        StudentService studentService = new StudentService();
        studentService.create(new Student("Егор", 25));
        studentService.create(new Student("Никита", 26));
        studentService.create(new Student("Анастасия", 24));
        return studentService;
    }
    private TeacherService setTeacher() {
        TeacherService teacherService = new TeacherService();
        teacherService.create(new Teacher("Александр", 37));
        return teacherService;
    }
    private int getIdTeacher() {
        return service.getStudyGroup().getTeacher().getTeacherId();
    }

    private ArrayList<Integer> getStudentsId() {
        ArrayList<Integer> idList = new ArrayList<>();
        for (Student student : service.getStudyGroup().getStudentList()) {
            idList.add(student.getStudentId());

        }
        return idList;
    }
}
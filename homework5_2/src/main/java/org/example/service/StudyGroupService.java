package org.example.service;

import org.example.model.StudyGroup;

public class StudyGroupService implements Service<StudyGroup> {

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

    StudyGroup studyGroup;

    @Override
    public void create(StudyGroup user) {
        studyGroup = user;

    }

    public void setTeacher(TeacherService teacherService, int teacherId){
        studyGroup.setTeacher(teacherService.read(teacherId));
    }

    public void setStudentsList(StudentService studentService){
        studyGroup.setStudentList(studentService.getStudentList());
    }

    @Override
    public StudyGroup read(int id) {
        return null;
    }
}
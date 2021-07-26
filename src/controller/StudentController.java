package controller;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private String name;
    private List<Student> studentList = new ArrayList<>();


    public StudentController() {
    }

    public void addNewStudent(Student student){
        studentList.add(student);
    }

    public StudentController(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}

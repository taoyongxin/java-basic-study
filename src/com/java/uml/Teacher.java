package com.java.uml;

import java.util.Set;

/**
 * @author Tao
 */
public class Teacher {
    private Integer id;
    private String teacherName;
    private Set<Student> students;



    public Teacher() {
    }

    public void teach(){
        System.out.println(this.teacherName + "在上课");
        System.out.println("学生名单");
        students.forEach(student ->
                System.out.println(student.getId() + "," +
                        student.getStudentName() + "," +
                        student.getPhone().getBrand()));

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Teacher(Integer id, String teacherName, Set<Student> students) {
        this.id = id;
        this.teacherName = teacherName;
        this.students = students;
    }
}

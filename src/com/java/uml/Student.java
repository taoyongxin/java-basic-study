package com.java.uml;

import java.util.Objects;

/**
 * @author Tao
 */
public class Student {
    private Integer id;
    private String studentName;
    private Phone phone;


    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Student)) {return false;}
        Student student = (Student) o;
        return Objects.equals(getId(), student.getId()) &&
                Objects.equals(getStudentName(), student.getStudentName()) &&
                Objects.equals(getPhone(), student.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStudentName(), getPhone());
    }

    public void study(Teacher teacher){
        teacher.teach();
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", phone=" + phone +
                '}';
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Student(Integer id, String studentName, Phone phone) {
        this.id = id;
        this.studentName = studentName;
        this.phone = phone;
    }


}

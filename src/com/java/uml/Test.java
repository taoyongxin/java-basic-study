package com.java.uml;

import java.util.*;

/**
 * @author Tao
 */
public class Test {
    public static void  main(String[] args){
        Phone iPhoneX = new Phone(1,"iPhoneX深空灰",8888.8);
        Phone iPhone8P = new Phone(2,"iPhone8P金色",6850.0);
        Phone iPhone8 = new Phone(3,"iPhone8粉色",4550.0);

        Student student1 = new Student(1003,"陶永新",iPhoneX);
        Student student2 = new Student(1001,"王锋",iPhone8P);
        Student student3 = new Student(1002,"颜子皓",iPhone8);


        /*Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);*/
        //排序输出结果
        Set<Student> students = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1 == o2){
                    return 0;
                }
                int result = o1.getId() - o2.getId();
                if (result == 0) {
                    return o1.getStudentName().compareTo(o2.getStudentName());
                }
                return result;
            }
        });
        students.add(student1);
        students.add(student2);
        students.add(student3);


        Teacher teacher = new Teacher();
        teacher.setId(1011);
        teacher.setTeacherName("许老师");
        teacher.setStudents(students);

        student1.study(teacher);
    }
}

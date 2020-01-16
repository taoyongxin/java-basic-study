package com.java.exercises;

import java.io.*;

/**
 * 所谓对象序列化就是将一个保存的对象变成一个二进制的数据流进行传输。
 * 如果一个二进制的数据流进行传输，如果一个对象需要被序列化，则对象
 * 所在的类必须实现Sericlizable接口。
 * 定义学生类，实现其序列化和反序列化。
 * @author Tao
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("TYX",'男',20);
        File file = new File("F:\\student.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //Student对象序列化过程
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.flush();
            oos.close();
            fos.close();

            //Student对象反序列化过程
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student student1 = (Student) ois.readObject();
            System.out.println("name="+student1.getName());
            System.out.println("sex="+student1.getSex());
            System.out.println("year="+student1.getYear());
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
class Student implements Serializable{
    private String name;
    private char sex;
    private int year;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", year=" + year +
                '}';
    }

    public Student() {
    }

    public Student(String name, char sex, int year) {
        this.name = name;
        this.sex = sex;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
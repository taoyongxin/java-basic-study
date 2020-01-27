package com.java.exercises;

/**
 * 至少用四种方法创建Student类的对象 1.18
 * @author Tao
 */
public class CreateStudent implements Cloneable{
    private String name;
    private int age;

    public CreateStudent() {
    }

    @Override
    public String toString() {
        return "CreateStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public CreateStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("1.使用new关键字创建对象");
        //使用new关键字创造对象
        CreateStudent student1 = new CreateStudent("tyx",22);
        System.out.println(student1);

        System.out.println("2.调用对象的clone()");
        //调用对象的clone()方法创建对象
        CreateStudent student2 = (CreateStudent)student1.clone();
        System.out.println(student2);

        System.out.println("3.调用 java.lang.Class 的 newInstance() 方法创建对象");
        //调用 java.lang.Class 的 newInstance() 方法创建对象
        CreateStudent createStudent = CreateStudent.class.getDeclaredConstructor(String.class,int.class).newInstance("cmj",20);
        System.out.println(createStudent);

        System.out.println("4.通过对象反序列化的方式来创建");
    }
}

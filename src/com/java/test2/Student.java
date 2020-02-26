package com.java.test2;

/**
 * @ClassName Student
 * @Description 建造者模式，Student是产品，StudentBuilder是静态构造器
 * 基本上所有的Java框架都用到了建造者模式，因为链式赋值真的太棒了，Spring框架、google的Guava、Lombok等
 * product是产品，是我们需要构建的对象，里面有静态的构造器Builder，由于是静态类，里面构造方法在使用的时候最开始便会构造，
 * 也就是里面的product每次使用时都会先实例化一个
 * 之后每次buildXXX后，我们可以看到返回的都是this,也就是这个静态类，就是这个原因，我们便可以在后面不断的连续buildXXX
 * 最后通过一个build返回所实例化的product。
 * @Author mq_xu
 * @Date 2020/2/25
 * @Version 1.0
 */
public class Student {
    private String name;
    private Integer age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //静态的建造者类，用以给产品类赋值
    public static class StudentBuilder {

        private String name;
        private Integer age;

        public StudentBuilder() {
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this.name, this.age);
        }
    }

}

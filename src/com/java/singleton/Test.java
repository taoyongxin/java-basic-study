package com.java.singleton;

/**
 * @author Tao
 */
public class Test {
    private class Abc{
        private Abc(){
        };
        Abc n1 = new Abc();
    }

    public class A{
        public A(){
            Abc n1,n2;
            n1 = new Abc();
            n2 = new Abc();
        }
    }
}

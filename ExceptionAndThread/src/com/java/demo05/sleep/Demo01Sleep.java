package com.java.demo05.sleep;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Demo01Sleep
 * @Description TODO
 * @date 2020-03-03 21:37
 * public static void sleep(long millis)：使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）
 * 毫秒数结束之后，线程继续执行
 **/
public class Demo01Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 1; i <= 60 ; i++) {
            System.out.println(i);

            //使用Thread类的slepp方法让程序睡眠一秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.java.demo10.Synchronized;

/**
 * @author Tao
 * @version 1.0
 * @ClassName RunnableImpl
 * @Description TODO
 * @date 2020-03-03 22:43
 * 卖票案例出现了线程安全问题
 * 卖出了不存在的票和重复的票
 *
 * 解决线程安全问题的第二种方案：使用同步方法
 * 使用步骤：
 *      1.把访问了共享数据的代码块抽取出来，放到一个方法中
 *      2.在方法上添加synchronized修饰符
 * 格式：定义方法的格式
 * 修饰符 synchronized 返回值类型 方法名（参数列表）{
 *     可能会出现线程安全问题的代码（访问了共享数据的代码）
 * }
 **/
public class RunnableImpl implements Runnable{

    //定义一个多个线程共享的票源

    private int ticket = 100;
    //设置线程任务：卖票

    @Override
    public void run() {
        //先判断票是否存在

        //使用死循环，让卖票操作重复执行
        while (true){
            saleTicket();
        }

    }
    /*定义一个同步方法*/
    public synchronized void saleTicket(){
        if (ticket>0){
            //提高安全问题出现的概率，让程序睡眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //票存在，卖票 ticket--
            System.out.println(Thread.currentThread().getName()+"--->正在卖"+ticket+"张票");
            ticket--;
        }
    }
}

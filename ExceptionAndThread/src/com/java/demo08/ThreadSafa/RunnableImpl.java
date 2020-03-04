package com.java.demo08.ThreadSafa;

/**
 * @author Tao
 * @version 1.0
 * @ClassName RunnableImpl
 * @Description TODO
 * @date 2020-03-03 22:43
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
}

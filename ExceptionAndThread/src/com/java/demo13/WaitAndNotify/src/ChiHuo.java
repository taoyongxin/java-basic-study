package com.java.demo13.WaitAndNotify.src;

/**
 * @author Tao
 * @version 1.0
 * @ClassName ChiHuo
 * @Description TODO
 * @date 2020-03-08 11:23
 * 消费者（吃货）类：是一个线程类，可以继承Thread
 * 设置线程任务（run）：吃包子
 * 对包子的状态进行判断
 * false：没有包子
 *      吃货调用wait方法进入等待状态
 * true：有包子
 *      吃货吃包子
 *      吃货吃完包子
 *      修改包子的状态为false没有
 *      吃货唤醒包子铺线程，生产包子
 **/
public class ChiHuo extends Thread{
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if(bz.flag == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("吃货正在吃："+bz.pi+bz.xian+"的包子");
                bz.flag = false;
                bz.notify();
                System.out.println("吃货已经把："+bz.pi+bz.xian+"的包子吃完了，包子铺开始生产包子");
                System.out.println("======================================================");
            }
        }
    }
}

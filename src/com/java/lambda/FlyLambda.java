package com.java.lambda;

/**
 * @author Tao
 */
public class FlyLambda {

    public static void main(String[] args) {
      /*  Fly fly = ()->{
            double speed = 666.66;
            System.out.println("飞行时速" + speed);
        };*/

        Fly fly = speed -> {
            System.out.println("飞行时速："+speed + "km/h");
        };
        fly.fly(4444);
      /* Fly fly = (speed,weather)->{
           System.out.println("天气：" + weather + ",飞行速度："+speed);
       };
       fly.fly(666.6,"阴天");*/
    }
}

/**
 * Fly接口
 */
interface Fly{
   // void fly();
    void fly(double speed);
   // void fly(double speed,String weather);
}
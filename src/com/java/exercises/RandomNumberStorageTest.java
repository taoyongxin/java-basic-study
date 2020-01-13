package com.java.exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Tao
 */
public class RandomNumberStorageTest {
    public static  void main(String[] args) {
        //存储100个0~99之间的随机整数
        int[] charNumber = new int[100];
        int n = 100;
        for (int i=0 ; i<n ; i++){
            int num = (int) (Math.random()*100);
            charNumber[i] = num;
        }
        for (int i=0 ; i<n ; i++){
            System.out.println(charNumber[i]);
        }

        //讲charNumber数组内容写入到本地文件
        File file = new File("G:\\randomNumber.txt");
        try {
            FileWriter fr = new FileWriter(file);
            for (int i=0;i<n;i++){
                fr.write(charNumber[i]+"\t");
                if((i+1)%5==0){
                    fr.write("\n");
                }
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package com.java.correct;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Tao
 */
public class RandomNumberStorageTest {
    private  static final int LENGTH = 100;

    public static void main(String[] args) throws IOException {
        int[] numbers = new int[LENGTH];
        Random random = new Random();
        for (int i = 0 ;i<LENGTH ;i++){
            numbers[i] = random.nextInt(LENGTH);
        }
        System.out.println(Arrays.toString(numbers));
        File file = new File("G:\\randomNumber.txt");
        Writer writer = new FileWriter(file,true);
        PrintWriter out = new PrintWriter(writer);
        out.println(Arrays.toString(numbers));
        out.flush();
        out.close();
        writer.close();
    }
}

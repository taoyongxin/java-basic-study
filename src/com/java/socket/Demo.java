package com.java.socket;

import java.io.*;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Demo
 * @Description TODO
 * @date 2020-02-28 17:23
 **/
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\randomNumber.txt");
//        InputStream is = new FileInputStream(file);
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
    }
}

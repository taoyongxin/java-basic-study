package com.java.exercises;

import java.io.*;

/**
 * @author Tao
 */
public class BufferedByteFileCopy {
    public static void main(String[] args) {
        File file1 = new File("G:\\randomNumber.txt");
        File file2 = new File("F:\\randomNumber.txt");
        if (!file2.exists()){
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] bytes = new byte[1024];
        int len = 0;
        try {
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
                try {
                    while ((len = fis.read(bytes)) != -1){
                        fos.write(bytes,0,len);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.java.socket;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Client4_1
 * @Description TODO
 * @date 2020-02-27 15:19
 **/
public class Client4_1 {
    public static void main(String[] args) throws IOException {
//        Socket client = new Socket("271545p5w4.wicp.vip", 45932);

        Socket client = new Socket("27155x3o38.zicp.vip", 59582);

        System.out.println("成功连上服务器");
        File file = new File("F:/taoyongxin.jpg");
        FileInputStream fis;
        DataOutputStream dos;
        if (file.exists()){
            fis = new FileInputStream(file);
            dos = new DataOutputStream(client.getOutputStream());
            //文件名和长度
            dos.writeUTF(file.getName());
            dos.flush();
            dos.writeLong(file.length());
            dos.flush();
            //开始传输文件
            System.out.println("===========开始传输文件===========");
            byte[] bytes = new byte[1024] ;
            int length = 0;
            long progress = 0;
            while ((length = fis.read(bytes,0,bytes.length)) != -1){
                dos.write(bytes,0,length);
                dos.flush();
                progress+=length;
                System.out.println((100*progress/file.length()) + "%——");
            }
            System.out.println();
            System.out.println("==============文件传输成功============");
        }
    }
}

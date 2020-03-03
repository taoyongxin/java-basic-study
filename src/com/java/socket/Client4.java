package com.java.socket;

import java.io.*;
import java.net.Socket;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Client4
 * @Description TODO
 * @date 2020-02-27 14:22
 **/
public class Client4 {
    public static void main(String[] args) throws IOException {
//        Socket client = new Socket("localhost",10086);
        Socket client = new Socket("271545p5w4.wicp.vip", 45932);


        System.out.println("成功连上服务器");
        //酷虎端需要发送的文件，先通过字节输入流读入字节数组b
        File file = new File("F:/taoyongxin.jpg");
        //通过文件构建输入字节流
        InputStream is = new FileInputStream(file);
        //通过client得到输出字节流
        OutputStream os = client.getOutputStream();
        //缓冲区
        byte[] buf = new byte[1024];
        int len = 0;
        //读取文件字节流fis并写入buf，-1位结束
        while ((len = is.read(buf)) != -1){
            os.write(buf,0,len);
        }
        is.close();
        os.close();
    }
}

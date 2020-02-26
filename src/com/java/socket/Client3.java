package com.java.socket;

import java.io.*;
import java.net.Socket;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Client3
 * @Description TODO
 * @date 2020-02-26 15:19
 **/
public class Client3 {
    public static void main(String[] args) throws IOException {
        Socket client;
        client = new Socket("271545p5w4.wicp.vip",45932);
        System.out.println("成功连接上服务器");

        File file = new File("G:\\tyx.txt");
        InputStream reader = new FileInputStream(file);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(reader));
        String str ;
        BufferedWriter buf = null;
        while ((str = stdin.readLine())!=null){
            buf = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            buf.write(str);
            buf.flush();
        }
        assert buf != null;
        buf.close();
        //从控制台读取字符串
       /* BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入内容");
        String str = stdin.readLine();
        BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        buf.write(str);
        buf.flush();
        buf.close();
        stdin.close();*/
    }
}

package com.java.socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Client6
 * @Description TODO
 * @date 2020-02-28 20:24
 **/
public class Client6 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("271545p5w4.wicp.vip",45932);
        System.out.println("成功连上服务器");
        //获得客户端的字节输入流
        InputStream is = client.getInputStream();
        //构建字节和字符的输入转换流
        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        //构建BufferedReader缓冲字符输入流
        BufferedReader br = new BufferedReader(isr);
        File file = new File("F:\\11.txt");
        //从本地文件构建字节输出流 追加模式
        OutputStream os = new FileOutputStream(file,true);
        //字节字符转换流
        OutputStreamWriter osw = new OutputStreamWriter(os);
        //构建缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(osw);

        String str;
        //接受读取信息
        while((str = br.readLine()) != null){
            //每题2秒在控制台输出服务器发送的数据
            System.out.println(str);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bw.write(str);
            bw.write("\r\n");
        }
        bw.close();
        br.close();
        client.close();
    }
}

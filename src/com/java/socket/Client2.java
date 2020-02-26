package com.java.socket;

import java.io.IOException;
import java.net.Socket;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Client2
 * @Description TODO
 * @date 2020-02-26 14:35
 **/
public class Client2 {
    public static void main(String[] args) throws IOException,InterruptedException {
        Socket client;
        // 服务器要先使用内网穿透工具
        client = new Socket("271545p5w4.wicp.vip",45932);
        System.out.println("成功连接服务器...");
        Thread.sleep(10000);
        // 关闭Socket
        client.close();
    }
}

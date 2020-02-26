package com.java.socket;

import java.io.IOException;
import java.net.Socket;

/**
 * @author Tao
 */
public class Client1 {
    public static void main(String[] args) throws IOException {
        // 声明Socket客户端 对象
        Socket client;
        // 指定连接的主机和端口
        client = new Socket("127.0.0.1",10086);
        System.out.println("成功连接上服务器");
        // 关闭Socket
        client.close();
    }
}

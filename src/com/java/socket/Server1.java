package com.java.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Tao
 */
public class Server1 {
    public static void main(String[] args) throws IOException {
        // 声明一个ServerSocket对象，表示一个服务端
        ServerSocket server;
        // 一个Socket对象，表示一个客户端
        Socket client;
        // 此时服务端对象在10086端口上创建成功，等待客户端的访问
        server = new ServerSocket(10086);
        System.out.println("服务器运行，等待客户端连接");
        // 程序在此阻塞，等待客户端连接
        client = server.accept();
        // 输出客户端连接成功的信息
        System.out.println("客户端" + client.getInetAddress() + "连接成功");
        // 关闭客户端连接
        client.close();
        // 关闭服务器连接
        server.close();
    }
}

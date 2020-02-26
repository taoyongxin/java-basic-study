package com.java.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Server2
 * @Description TODO
 * @date 2020-02-26 14:40
 **/
public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器运行，等待客户端连接");
        Socket socket;
        //记录客户端的数量
        int count = 0;
        while (true){
            socket = serverSocket.accept();
            ServerThread2 server = new ServerThread2(socket);
            new Thread(server).start();
            count++;
            System.out.println("当前客户端连接的数量："+count);
        }
    }
}
/**
 * 服务端线程类，每个线程类可以接受一个客户端
 */
class ServerThread2 implements Runnable{

    private Socket socket;

    public ServerThread2(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("有新的客户端连接成功");
    }
}
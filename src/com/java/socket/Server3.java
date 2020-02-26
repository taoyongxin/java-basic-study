package com.java.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Server3
 * @Description TODO
 * @date 2020-02-26 15:13
 **/
public class Server3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器启动。。");
        int count = 0;
        Socket socket;
        while (true){
            socket = serverSocket.accept();
            ServerThread3 server = new ServerThread3(socket);
            new Thread(server).start();
            count++;
            System.out.println("当前客户端连接的数量："+count);
        }

    }
}
class ServerThread3 implements Runnable{

    private  Socket socket;

    public ServerThread3(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("有新的客户端连接成功");
        InputStream inputStream = null;
        try {
            assert false;
            inputStream = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            String str;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
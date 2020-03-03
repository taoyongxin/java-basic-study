package com.java.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Server6
 * @Description TODO
 * @date 2020-02-28 16:07
 **/
public class Server5 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10088);
        System.out.println("服务器启动");
        Socket socket;
        while (true){
            socket = serverSocket.accept();
            ServerThread5 serverThread5 = new ServerThread5(socket);
            new Thread(serverThread5).start();

        }
    }
}
class ServerThread5 implements Runnable{

    private Socket socket;

    public ServerThread5(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("客户端连接成功");
        String info = "tyx发送一条信息";
        OutputStream os = null;
        try {
            os = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //构建打印流
        assert os != null;
        PrintWriter pw = new PrintWriter(os);
        pw.println(info);
        pw.close();
    }
}
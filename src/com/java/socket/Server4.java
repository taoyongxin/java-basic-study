package com.java.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Server4
 * @Description TODO
 * @date 2020-02-27 14:53
 **/
public class Server4 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10088);
        System.out.println("服务器启动");
        Socket socket;
        while (true){
            socket =serverSocket.accept();
            ServerThread4 server = new ServerThread4(socket);
            new Thread(server).start();
        }
    }
}
class ServerThread4 implements Runnable{
    private Socket socket;

    public ServerThread4(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        System.out.println("客户端连接成功！");
        try {
            InputStream is = socket.getInputStream();
            File file = new File("F:/test/"+ UUID.randomUUID().toString()+".java");
            OutputStream os = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = is.read(buf)) != -1){
                os.write(buf,0,len);
            }
            socket.shutdownOutput();
            os.close();
            is.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
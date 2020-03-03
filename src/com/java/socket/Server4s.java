package com.java.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Server4
 * @Description TODO
 * @date 2020-02-26 19:40
 **/
public class Server4s {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器启动");
        Socket socket;
        while (true){
            socket = serverSocket.accept();
            ServerThread4 server = new ServerThread4(socket);
            new Thread(server).start();
        }
    }
    static class ServerThread4 implements Runnable{
        private Socket socket;

        public ServerThread4(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            System.out.println("新客户端连接");
            InputStream inputStream = null;
            try {
                inputStream = socket.getInputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            assert inputStream !=null;
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            try {
                String s = br.readLine();
                System.out.println(s);
                if (s!=null){
                    write(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void write(String s){
            String i = UUID.randomUUID().toString();
            File file = new File("G://"+i+".txt");
            if (!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println("创建文件异常");
                    e.printStackTrace();
                }
            } else {
                System.out.println("文件"+file.getName()+"已存在！");
            }
            FileOutputStream fos ;
            PrintStream ps = null ;
            try {
                fos = new FileOutputStream(file);
                ps = new PrintStream(fos);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            assert ps != null;
            ps.append(s);
            ps.close();
            System.out.println("文件写入完毕");
        }
    }
}

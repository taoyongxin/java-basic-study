package com.java.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Server6
 * @Description TODO
 * @date 2020-02-28 17:27
 **/
public class Server6 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10088);
        System.out.println("服务器启动");
        Socket socket;
        while (true){
            socket = serverSocket.accept();
            ServerThread6 server = new ServerThread6(socket);
            new Thread(server).start();
        }
    }
}
class ServerThread6 implements Runnable{

    private Socket socket;

    public ServerThread6(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("客户端连接成功！");
        File file = new File("F:\\gushi.txt");
        //从文件构建本地的字节输入流
        InputStream is = null;
        try {
            is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //构建字节字符转换流
        assert is != null;
        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        //构建缓冲字符输入流
        BufferedReader br = new BufferedReader(isr);

        //定义字节输出流，从socket获取
        OutputStream os = null;
        try {
            os = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //构建字节字符转换流
        assert os != null;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        //构建缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(osw);

        String line;
        try {
            //使用缓冲字符输入流按行读取
            while ((line = br.readLine())!=null){
                System.out.println(line);
                //通过缓冲字符输出流输出
                bw.write(line);
                //每次写完一行，加回车换行
                bw.write("\r\n");
                bw.flush();
            }
            //别忘记关闭
            socket.shutdownOutput();
            bw.close();
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
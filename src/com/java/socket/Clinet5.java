package com.java.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Clinet6
 * @Description TODO
 * @date 2020-02-28 16:18
 **/
public class Clinet5 {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("271545p5w4.wicp.vip", 45932);

        System.out.println("成功连上服务器");
        //获得客户端的字节输入流
        InputStream is = socket.getInputStream();
        //构建一个Scanner
        Scanner scanner = new Scanner(is);
        String line = scanner.nextLine();
        System.out.println("接收到服务端数据：" + line);
        scanner.close();
        is.close();
        socket.close();

    }
}

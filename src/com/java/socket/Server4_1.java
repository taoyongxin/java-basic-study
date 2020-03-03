package com.java.socket;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Server4_1
 * @Description TODO
 * @date 2020-02-27 15:50
 **/
public class Server4_1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10088);
        System.out.println("服务器启动");
        Socket socket;
        while (true){
            socket = serverSocket.accept();
            ServerThread4_1 server = new ServerThread4_1(socket);
            new Thread(server).start();
        }
    }
}
class ServerThread4_1 implements Runnable{

    private Socket socket;
    private DataInputStream dis;
    private FileOutputStream fos;

    public ServerThread4_1(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("客户端"+ socket.getRemoteSocketAddress()+"连接成功！");
        try {
            dis=new DataInputStream(socket.getInputStream());
            String fileName = dis.readUTF();
            long fileLength = dis.readLong();
            File directory = new File("F:\\test");
            if (!directory.exists()){
                directory.mkdir();
            }
            File file = new File(directory.getAbsolutePath() + File.separator+fileName);
            fos = new FileOutputStream(file);
            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length = dis.read(bytes,0,bytes.length))!=-1){
                fos.write(bytes,0,length);
                fos.flush();
            }
            System.out.println("==============文件接收成功，file name：" + fileName + "============");
            System.out.println("==============w文件大小"+fileLength +"]===================");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
                try{
                    if (fos != null){
                        fos.close();
                    }
                    if (dis != null){
                        dis.close();
                    }
                }catch (Exception ignored){

                }
        }
    }
}

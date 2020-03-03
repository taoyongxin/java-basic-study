package com.java.socket;

import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Server7
 * @Description TODO
 * @date 2020-03-01 17:10
 **/
public class Server7 extends JFrame {
    private JPanel mainPanel;
    private JTextArea infoArea;
    private JScrollPane rightPane;
    private JScrollPane leftPane;
    private JList<String> onlineList;

    public Server7(){
        setTitle("服务器端");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setVisible(true);
        DefaultListModel model = new DefaultListModel();
        try {
            ServerSocket serverSocket = new ServerSocket(10088);
            infoArea.append("服务器启动...\r\n");
            Socket client;
            while (true){
                client = serverSocket.accept();
                //服务器线程，负责管理聊天内容
                ServerThread7 server = new ServerThread7(client);
                server.setComponent(infoArea,onlineList,model);
                new Thread(server).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new Server7();
    }
}

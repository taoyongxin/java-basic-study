package com.java.socket;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Tao
 * @version 1.0
 * @ClassName ServerThread7
 * @Description TODO
 * @date 2020-03-01 17:16
 **/
public class ServerThread7 implements Runnable{
    private Socket socket;
    private JTextArea infoArea;
    private JList<String> onlineList;
    private DefaultListModel<String> model;
    public void setComponent(JTextArea infoArea,JList<String> onlineList,DefaultListModel<String> model){
        this.infoArea = infoArea;
        this.onlineList = onlineList;
        this.model = model;
    }
    public ServerThread7(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            String address = socket.getInetAddress().toString();
            if(model.size() == 0){
                model.addElement(address);
            }else{
                int i;
                for (i = 0;i<model.getSize();i++){
                    if (model.getElementAt(i).equals(address)){
                        break;
                    }
                }
                if (i == model.size()){
                    model.addElement(address);
                }
            }
            onlineList.setModel(model);
            onlineList.revalidate();
            InputStream inputStream = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String info = br.readLine();
            LocalDateTime ldt = LocalDateTime.now();
            String timeString = ldt.format(DateTimeFormatter.ofPattern("yyyy年 MM 月 dd 日 HH:mm:ss"));
            infoArea.append(timeString+"\r\n");
            infoArea.append(info+"\r\n");
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

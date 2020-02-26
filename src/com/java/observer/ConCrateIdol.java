package com.java.observer;

import java.util.ArrayList;

public class ConCrateIdol implements Idol{
    private ArrayList<Fan> fans;

    public ConCrateIdol() {
        this.fans = new ArrayList<Fan>();
    }

    //增加粉丝
    @Override
    public void addFan(Fan fan) {
        fans.add(fan);
    }

    //拉黑粉丝
    @Override
    public void delFan(Fan fan) {
        fans.remove(fan);
    }

    //明星发布动态，通知所有自己粉丝
    @Override
    public void notify(String message) {
        for (Fan fan:fans){
            fan.update(message);
        }
    }
}

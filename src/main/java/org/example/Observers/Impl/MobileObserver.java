package org.example.Observers.Impl;

import org.example.Observable.StockObservable;
import org.example.Observers.NotificationAlertObserver;

public class MobileObserver implements NotificationAlertObserver {
    String userName;
    StockObservable stockObservable;

    public MobileObserver(String mobileNo,StockObservable observable){
        this.stockObservable=observable;
        this.userName=mobileNo;
    }
    @Override
    public void update() {
        sendMsg(userName,"Iphone is in stock lele bhai kya krrha hai!");
    }

    private void sendMsg(String userName, String s) {
        System.out.println("Message '"+s+"' sent to " +userName);
    }
}

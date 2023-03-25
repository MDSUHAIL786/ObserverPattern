package org.example.Observers.Impl;

import org.example.Observable.StockObservable;
import org.example.Observers.NotificationAlertObserver;

public class EmailObserver implements NotificationAlertObserver {
    String email;
    StockObservable stockObservable;

    public EmailObserver(String mailId,StockObservable observable){
        this.email=mailId;
        this.stockObservable=observable;
    }
    @Override
    public void update() {
        sendMail(email,"Iphone is in stock hurry up!");
    }

    private void sendMail(String email, String s) {
        System.out.println("Mail "+s+" sent to "+email);
    }
}

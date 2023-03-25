package org.example.Observable.Impl;

import org.example.Observable.StockObservable;
import org.example.Observers.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {
    List<NotificationAlertObserver> observerList=new ArrayList<>();   //list of observers whose hit notifyMe button
    private int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }

    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount==0 && newStockAdded!=0){
            notifySubscribers();
        }
        stockCount+=newStockAdded;
    }

    @Override
    public int getStockCounts() {
        return stockCount;
    }
}

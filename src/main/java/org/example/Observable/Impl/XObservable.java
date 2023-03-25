package org.example.Observable.Impl;

import org.example.Observable.StockObservable;
import org.example.Observers.NotificationAlertObserver;


//where X is any product like laptop, machine, rings, earbuds etc
public class XObservable implements StockObservable {
    @Override
    public void add(NotificationAlertObserver observer) {

    }

    @Override
    public void remove(NotificationAlertObserver observer) {

    }

    @Override
    public void notifySubscribers() {

    }

    @Override
    public void setStockCount(int newStockAdded) {

    }

    @Override
    public int getStockCounts() {
        return 0;
    }
}

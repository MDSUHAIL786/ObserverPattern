package org.example;

import org.example.Observable.Impl.IphoneObservable;
import org.example.Observable.StockObservable;
import org.example.Observers.Impl.EmailObserver;
import org.example.Observers.Impl.MobileObserver;
import org.example.Observers.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable observable=new IphoneObservable();   //user come to buy iphone

        //if out of stock so user has option to notify over mail or mobile whenever again in stock
        NotificationAlertObserver observer1=new EmailObserver("suhailSaifi45@gmail.com",observable);
        NotificationAlertObserver observer2=new MobileObserver("8376844675",observable);
        NotificationAlertObserver observer3=new EmailObserver("mds.saifi@nsut.ac.in",observable);
        NotificationAlertObserver observer4=new MobileObserver("9090056370",observable);


        //add these observer in list or db of corresponding observable like iphone or any other observable
        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);
        observable.add(observer4);

        //set stock count for product if it is more than 0 so notification will be send to user other wise no
        observable.setStockCount(9);





    }
}
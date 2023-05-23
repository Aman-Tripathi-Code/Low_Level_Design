package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable){
        this.userName = userName;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMsgOnMobile(userName,"Product is in stocks, hurry up!");
    }

    private void sendMsgOnMobile(String userName , String msg){
        System.out.println("Message sent to: " + userName);
        //sends the actual msg to the end user
    }
}

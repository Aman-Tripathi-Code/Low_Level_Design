package Observer;

import Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    StocksObservable observable;
    String emailId;

    public EmailAlertObserverImpl(String emailId,StocksObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendMail(emailId,"Product is in stock, hurry up!");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("Mail sent to:" + emailId);
        //send the actual email to the end user
    }
}

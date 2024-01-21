package DesignPatterns.Decorator;

public class SmsSender implements NotificationSender{
//    We can use optional here to handle null passed
    private final NotificationSender notificationSender;
    SmsSender(NotificationSender notificationSender){
        this.notificationSender=notificationSender;
    }
    @Override
    public void send() {
        if(notificationSender != null) notificationSender.send();
        System.out.println("Send SMS");
    }
}

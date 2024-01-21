package DesignPatterns.Decorator;

public class EmailSender implements NotificationSender{

    private final NotificationSender notificationSender;

    EmailSender(NotificationSender notificationSender){
        this.notificationSender=notificationSender;
    }
    @Override
    public void send() {
        if(notificationSender != null) notificationSender.send();
        System.out.println("Send Email");
    }
}

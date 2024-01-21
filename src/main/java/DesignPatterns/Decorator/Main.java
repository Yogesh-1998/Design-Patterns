package DesignPatterns.Decorator;

//Send notification to users based on some configs

/**
 * Mails
 * SMS
 * Push Notification
 *In case we want to follow some order of execution even that will be taken care by decorator
 *
 * io streams like bufferreader use decorator
 **/

class Main {
    public static void main(String[] args) {
        NotificationSender notificationSender = new EmailSender(new SmsSender(null));
        NotificationSender notificationSender1 = new SmsSender(new EmailSender(null));

        notificationSender.send();
    }

}

package DesignPatterns.DecoratorVsAdapter;

import DesignPatterns.DecoratorVsAdapter.dependency.DependencyNotificationSender;

public class AppNotificationSender implements NotificationSender {
    private final DependencyNotificationSender dependencyNotificationSender;

    public AppNotificationSender(DependencyNotificationSender dependencyNotificationSender) {
        this.dependencyNotificationSender = dependencyNotificationSender;
    }

    @Override
    public void send() {
        dependencyNotificationSender.send();
    }
}

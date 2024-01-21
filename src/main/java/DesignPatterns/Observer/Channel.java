package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyChanges(String videoname) {
        subscribers.stream().forEach(subscriber -> subscriber.notified(videoname));
    }
}

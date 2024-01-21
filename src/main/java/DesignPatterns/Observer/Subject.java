package DesignPatterns.Observer;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyChanges(String videoname);
}

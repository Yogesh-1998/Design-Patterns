package DesignPatterns.Observer;

public class Subscriber implements Observer{
    String name;
    Subscriber(String name){
        this.name =name;
    }
    @Override
    public void notified(String videoname){
        System.out.println("New video " + videoname + " out now "+name+"!!!");
    }
}

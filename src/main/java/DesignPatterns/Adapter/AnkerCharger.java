package DesignPatterns.Adapter;

public class AnkerCharger implements AppleCharger{

    @Override
    public void chargePhone() {
        System.out.println("Iphone is Charging ... ");
    }
}

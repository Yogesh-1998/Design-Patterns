package DesignPatterns.Adapter;

public class Iphone {
    private AppleCharger appleCharger;

    Iphone(AppleCharger appleCharger){
        this.appleCharger=appleCharger;
    }

    public void chargeIPhone(){
        appleCharger.chargePhone();
    }

}

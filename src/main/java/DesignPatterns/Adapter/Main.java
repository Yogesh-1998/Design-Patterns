package DesignPatterns.Adapter;

class Main {
    public static void main(String[] args) {

        AppleCharger charger = new AdapterCharger(new IBallCharger());
        Iphone iphone14pro = new Iphone(charger);
        iphone14pro.chargeIPhone();
    }
}

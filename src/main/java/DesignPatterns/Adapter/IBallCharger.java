package DesignPatterns.Adapter;

public class IBallCharger implements AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Android phone is charging ... ");
    }
}

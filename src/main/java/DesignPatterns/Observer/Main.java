package DesignPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        Subject youtubechannel = new Channel();
        Observer yogesh = new Subscriber("yogesh");
        youtubechannel.subscribe(yogesh);
        Observer ankit = new Subscriber("ankit");
        youtubechannel.subscribe(ankit);
        youtubechannel.notifyChanges("Observer Pattern");
    }
}

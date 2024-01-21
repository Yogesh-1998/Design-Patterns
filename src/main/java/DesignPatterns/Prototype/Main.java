package DesignPatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.setIp("12345");
        prototype.loadImpData();

        try {
            Prototype prototype1 = (Prototype) prototype.clone();
            Prototype prototype2 = (Prototype) prototype.clone();
            System.out.println(prototype1.toString());

            prototype1.getDomains().remove(1);
            System.out.println(prototype.toString());
            System.out.println(prototype1.toString());
            System.out.println(prototype2.toString());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }



    }
}

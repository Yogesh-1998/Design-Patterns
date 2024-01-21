//package DesignPatterns.FactoryExample2;
//
//public class CarFactory implements VehicleFactory{
//
//    public Car create(CarType carType){
//        switch (carType){
//            case BMW -> new BMW();
//            case Audi -> new Audi();
//        }
//        throw new NullPointerException();
//    }
//
//    public enum CarType {
//        BMW, Audi;
//    }
//}

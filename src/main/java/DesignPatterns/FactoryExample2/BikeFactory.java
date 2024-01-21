//package DesignPatterns.FactoryExample2;
//
//public class BikeFactory implements VehicleFactory{
//
//    @Override
//    public Bike create(BikeType bikeType){
//        switch (bikeType){
//            case KTM -> new KTM();
//            case Yamaha -> new Yamaha();
//        }
//        throw new NullPointerException();
//    }
//
//    public enum BikeType{
//        KTM, Yamaha;
//    }
//}

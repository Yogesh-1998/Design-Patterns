//package DesignPatterns.FactoryExample2;
//
//public interface VehicleFactory {
//
//    Vehicle create();
//    static VehicleFactory create(VehicleType vehicleType){
//        switch (vehicleType){
//            case CAR -> {
//                return new CarFactory();
//            }
//            case BIKE -> {
//                return new BikeFactory();
//            }
//        }
//        throw new IllegalArgumentException();
//    }
//
//    enum VehicleType{
//        CAR, BIKE;
//    }
//}

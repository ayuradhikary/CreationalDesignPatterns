package FactoryDesignPattern;

public class ElectronicFactory {

     ElectronicDevice getDevice(String deviceType){
        ElectronicDevice device =null;
        if("headphone".equals(deviceType)){
            device = new HeadPhone();
        } else if ("laptop".equals(deviceType)) {
            device = new Laptop();
        } else if ("airconditioner".equals(deviceType)) {
            device = new AirConditioner();
        }
        return device;
    }
}

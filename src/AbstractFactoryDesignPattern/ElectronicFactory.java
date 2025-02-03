package AbstractFactoryDesignPattern;

public class ElectronicFactory extends DeviceFactory{

    @Override
    public Device getDevice(String deviceType) {
        Device device = null;
        if("laptop".equals(deviceType)){
            device = new Laptop();
        } else if ("headphone".equals(deviceType)) {
            device = new HeadPhone();
        }
        return device;
    }
}

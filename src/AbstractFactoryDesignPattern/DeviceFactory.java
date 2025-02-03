package AbstractFactoryDesignPattern;

public abstract class DeviceFactory {

    public abstract Device getDevice(String deviceType);

    public static DeviceFactory getDeviceFactory(String factoryType) {
        DeviceFactory deviceFactory = null;
        if("nonelectronic".equals(factoryType)){
            deviceFactory = new NonElectronicFactory();
        }
        else {
            deviceFactory = new ElectronicFactory();
        }
        return deviceFactory;
    }
}

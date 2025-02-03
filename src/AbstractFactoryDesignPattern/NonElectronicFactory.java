package AbstractFactoryDesignPattern;

public class NonElectronicFactory extends DeviceFactory{
    @Override
    public Device getDevice(String deviceType) {
        Device device = null;
        if("bottle".equals(deviceType)){
            device = new Bottle();
        } else if ("pen".equals(deviceType)) {
            device = new Pen();
        }
        return device;
    }
}

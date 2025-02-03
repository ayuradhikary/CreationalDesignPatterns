package AbstractFactoryDesignPattern;

public class AbstractFactoryPatternImplementation {
    public static void main(String[] args) {
        DeviceFactory nonelectronicdeviceFactory = DeviceFactory.getDeviceFactory("nonelectronic");
        Device ayursbottle = nonelectronicdeviceFactory.getDevice("bottle");
        ayursbottle.on();

        DeviceFactory electronicdevicefactory = DeviceFactory.getDeviceFactory("electronic");
        Device ayurslaptop = electronicdevicefactory.getDevice("laptop");
        ayurslaptop.on();
    }
}

package FactoryDesignPattern;

public class FactoryDesignPatternImplementation {
    public static void main(String[] args) {
        ElectronicFactory electronicFactory = new ElectronicFactory();
        ElectronicDevice ayursLaptop = electronicFactory.getDevice("laptop");
        ayursLaptop.On();
        ElectronicDevice ayursheadphone = electronicFactory.getDevice("headphone");
        ayursheadphone.On();
        ElectronicDevice fourthFloorAc = electronicFactory.getDevice("airconditioner");
        fourthFloorAc.On();
    }
}

package ProtoTypeDesignPattern;
import java.util.Hashtable;

public class ElectronicCache{
    private static Hashtable<String, Electronic> ElectronicMap = new Hashtable<>();

    public static Electronic getElectronic(String ElectronicType){
        Laptop laptop = (Laptop) ElectronicMap.get(ElectronicType);
        if(laptop == null){
            Keyboard keyboard = new Keyboard();
            keyboard.setLength(12.01);
            Screen screen = new Screen();
            screen.setSize(14.1);
            laptop= new Laptop("Lenovo","Thinkpad","UltraBook","Grey",keyboard,screen);
            ElectronicMap.put("laptop",laptop);
            return laptop;
        }
        System.out.println("\nCloned Laptop Object is created and return\n");
        return laptop.clone();
    }
}

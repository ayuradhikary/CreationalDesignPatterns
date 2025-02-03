package ProtoTypeDesignPattern;

public class ProtoTypePatternDemo {
    public static void main(String[] args) {
        Laptop laptop = (Laptop) ElectronicCache.getElectronic("laptop");
        displayElectronicProperty(laptop);

        Laptop clonedlaptop1 = (Laptop)ElectronicCache.getElectronic("laptop");
        clonedlaptop1.setName("Lenovo");
        clonedlaptop1.setModel("P14s");
        clonedlaptop1.setColor("Brown");
        clonedlaptop1.setType("UltraBook");
        displayElectronicProperty(clonedlaptop1);

        Laptop clonedlaptop2 = (Laptop)ElectronicCache.getElectronic("laptop");
        clonedlaptop2.setName("Acer");
        clonedlaptop2.setModel("predator");
        clonedlaptop2.setColor("Black");
        clonedlaptop2.setType("gaming");
        displayElectronicProperty(clonedlaptop2);


    }

    public static void displayElectronicProperty(Electronic electronic)
    {
        if (electronic instanceof Laptop)
        {
            Laptop laptop = (Laptop) electronic;
            System.out.println(laptop.toString());
            System.out.println("----------------------------------------------------------");

        }
    }

}

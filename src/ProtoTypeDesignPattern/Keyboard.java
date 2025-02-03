package ProtoTypeDesignPattern;

public class Keyboard {
    private double length;

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public String toString()
    {
        return "laptopkeyboard [length=" + length + "]";
    }
}

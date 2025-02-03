package ProtoTypeDesignPattern;

public class Screen {
    private double size;

    public double getSize(){
        return size;
    }
    public void setSize(double size){
        this.size = size;
    }

    @Override
    public String toString()
    {
        return "laptopkeyboard [size=" + size + "]";
    }
}

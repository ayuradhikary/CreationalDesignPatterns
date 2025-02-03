package ProtoTypeDesignPattern;

import java.security.Key;

public class Laptop implements Electronic{
    private String name;
    private String model;
    private String type;
    private String color;
    private Keyboard keyboard;
    private  Screen screen;

    public Laptop(String name, String model, String type, String color, Keyboard keyboard,Screen screen){
        super();
        this.name = name;
        this.model = model;
        this.type = type;
        this.color = color;
        this.keyboard = keyboard;
        this.screen = screen;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(String color){
        return color;
    }

    public void setKeyboardLength( Keyboard keyboard )
    {
        this.keyboard = keyboard;
    }

    public Keyboard getKeyboardLength()
    {
        return keyboard;
    }

    public void setScreenSize(Screen screenSize){
        this.screen = screenSize;
    }

    public Screen getScreen(){
        return screen;
    }

    @Override
    public Electronic clone() {
        Laptop laptopObject = null;

        try
        {

            laptopObject = (Laptop) super.clone();

        }

        catch( CloneNotSupportedException e )
        {

            e.printStackTrace();

        }

        return laptopObject;
    }

    @Override
    public String toString(){
        return "Laptop [name=" + name + ", model=" + model + ", color=" + color + ", type=" + type + ", keyboard="
                + keyboard.getLength() + ", screen=" + screen.getSize() + "]";
    }
}

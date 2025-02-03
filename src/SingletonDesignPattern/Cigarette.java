package SingletonDesignPattern;

public class Cigarette {
    private static Cigarette cigaretteInstance;

    private Cigarette(){} //private constructor

    public static Cigarette getCigaretteInstance(){
        if(cigaretteInstance ==  null){
            cigaretteInstance = new Cigarette();
        }
        return cigaretteInstance;
    }

    public void printcigaretteInstance(){
        System.out.println("Your cigarette: "+cigaretteInstance.toString());
        System.out.println("You are only allowed one cigarette a day.");
    }
}

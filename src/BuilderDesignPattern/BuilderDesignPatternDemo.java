package BuilderDesignPattern;

public class BuilderDesignPatternDemo {
    public static void main(String[] args) {
        MotorBikeBuilder builder = new MotorBikeBuilder();
        builder.color("blue");
        builder.brand("Yamaha");
        builder.model("R1");
        builder.id(1);
        MotorBike R1 = builder.build();
        System.out.println(R1);

        Director director = new Director();
        MotorBikeBuilder buildertwo = new MotorBikeBuilder();
        director.buildHonda(buildertwo);
        buildertwo.id(1);
        MotorBike Hornet = buildertwo.build();
        System.out.println(Hornet);
    }
}
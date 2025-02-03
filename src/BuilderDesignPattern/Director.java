package BuilderDesignPattern;

public class Director {
    public void buildSuzuki(Builder builder) {
        builder.brand("Suzuki")
                .model("Gixxer1000")
                .color("Blue");
    }

    public void buildHonda(Builder builder) {
        builder.brand("Honda")
                .model("Hornet1000")
                .color("Yellow");
    }
}

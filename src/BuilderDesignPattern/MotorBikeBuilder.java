package BuilderDesignPattern;

public class MotorBikeBuilder implements Builder{
    private  int id;
    private  String brand;
    private  String model;
    private  String color;

    @Override
    public MotorBikeBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public MotorBikeBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public MotorBikeBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public MotorBikeBuilder color(String color) {
        this.color = color;
        return this;
    }

    public MotorBike build() {
        return new MotorBike(id,brand,model,color);
    }
}

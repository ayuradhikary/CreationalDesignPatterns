package BuilderDesignPattern;

public class MotorBike {
    private final int id;
    private final String brand;
    private final String model;
    private final String color;

     MotorBike(int id, String brand, String model, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return """
                MotorBike {
                    id=%s,
                    brand=%s,
                    model=%s,
                    color=%s
                }""".formatted(id, brand, model, color);
    }
}

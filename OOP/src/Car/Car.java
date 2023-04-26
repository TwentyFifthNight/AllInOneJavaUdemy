package Car;

public class Car {
    private int cylinders;
    private String name;
    private int wheels;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return "Car - The engine is starting";
    }

    public String accelerate(){
        return "Car - The car is accelerating";
    }

    public String brake(){
        return "Car - The car is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

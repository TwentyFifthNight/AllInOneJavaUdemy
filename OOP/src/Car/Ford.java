package Car;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return getClass().getSimpleName() + " - The engine is starting";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " - The car is accelerating";
    }

    public String brake(){
        return getClass().getSimpleName() + " - The car is braking";
    }
}

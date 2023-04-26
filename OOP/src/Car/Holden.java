package Car;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
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

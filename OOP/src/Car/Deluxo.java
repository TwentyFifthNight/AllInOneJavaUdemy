package Car;

public class Deluxo extends Car{
    public Deluxo() {
        super(6, "Deluxo");
    }

    public String startEngine(){
        return getClass().getSimpleName() + " engine is starting";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " is accelerating";
    }

    public String brake(){
        return getClass().getSimpleName() + " is braking";
    }
}

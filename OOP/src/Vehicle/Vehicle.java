package Vehicle;

public class Vehicle {
    private String name;
    private int speed;
    private int direction;


    public Vehicle(String name) {
        this.name = name;
        this.speed = 0;
        this.direction = 0;
    }

    public void steer(int direction){
        this.direction += direction;
        System.out.println("Steering at " + this.direction + " degres.");
    }

    public  void move(int speed, int direction){
        this.speed = speed;
        this.direction = direction;
        System.out.println("Moving at " + this.speed + " in direction " + this.direction);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public void stop(){
        this.speed = 0;
    }
}

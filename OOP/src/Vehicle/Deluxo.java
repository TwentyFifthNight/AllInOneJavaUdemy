package Vehicle;

public class Deluxo extends Car{
    private int roadServiceMonths;

    public Deluxo(int roadServiceMonths) {
        super("Deluxo", 4, 3, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getSpeed() + rate;
        if(newVelocity == 0)
            stop();
        else if (newVelocity > 0 && newVelocity <= 10)
            changeGear(1);
        else if (newVelocity > 10 && newVelocity <= 20)
            changeGear(2);
        else if (newVelocity > 20 && newVelocity <= 50)
            changeGear(3);
        else if (newVelocity > 50 && newVelocity <= 80)
            changeGear(4);
        else
            changeGear(5);

        if(newVelocity > 0)
            changeVelocity(newVelocity, getDirection());
    }
}

package InterfacesChallenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints, strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(this.name);
        list.add("" + this.hitPoints);
        list.add("" + this.strength);
        return list;
    }

    @Override
    public void read(List<String> listOfParameters) {
        if(listOfParameters != null && listOfParameters.size() > 0){
            this.name = listOfParameters.get(0);
            this.hitPoints = Integer.parseInt(listOfParameters.get(1));
            this.strength = Integer.parseInt(listOfParameters.get(2));
        }
    }
}

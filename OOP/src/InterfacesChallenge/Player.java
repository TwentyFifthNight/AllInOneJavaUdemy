package InterfacesChallenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name, weapon;
    private int hitPoints, strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(this.name);
        list.add("" + this.hitPoints);
        list.add("" + this.strength);
        list.add(this.weapon);
        return list;
    }

    @Override
    public void read(List<String> listOfParameters) {
        if(listOfParameters != null && listOfParameters.size() > 0){
            this.name = listOfParameters.get(0);
            this.hitPoints = Integer.parseInt(listOfParameters.get(1));
            this.strength = Integer.parseInt(listOfParameters.get(2));
            this.weapon = listOfParameters.get(3);
        }
    }
}

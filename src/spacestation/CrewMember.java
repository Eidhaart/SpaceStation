package spacestation;

import java.util.HashMap;

public class CrewMember {

    private boolean inStation = true;
    private String name;
    private int health;
    private int speed;
    private int level;
    private int energy;
    private String type;

    public CrewMember(String name, int health, int speed, int level, String type) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.level = level;
        this.energy = 50;
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public int getEnergy(){
        return energy;
    }


}

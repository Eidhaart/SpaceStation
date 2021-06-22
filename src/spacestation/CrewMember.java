package spacestation;

import java.util.Random;

public class CrewMember {

    private String name;
    private int health;
    private int speed;
    private int level;
    private int energy;
    private String type;
    private boolean hasEnergy;
    Random random = new Random();

    public CrewMember(String name, int health, int speed, int level, String type) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.level = level;
        this.energy = 50;
        this.type = type;
    }

    public CrewMember(String name) {
        this.name = name;
        this.health = random.nextInt(5) + 20;
        this.level = 1;
        this.type = "Worker";
        this.energy = 50;
        this.speed = 10;
    }

    public int getSpeed() {
        return speed;
    }

    public int getEnergy() {
        return energy;
    }


    public String toString() {
        return name + "=" +
                " Level: " + level +
                " Health: " + health +
                " Type: " + type;
    }


}

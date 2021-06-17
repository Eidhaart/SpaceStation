package spacestation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Ship implements Mining {


    private String name;
    private int size;
    private int mineSpeed = 10;
    private boolean isDocked;
    private double miningLevel = 0.25;

    List<CrewMember> members = new ArrayList<>();
    HashMap<String, Integer> shipResources = new HashMap<>();


    public Ship(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public int getSize() {
        return size;
    }


    public int getMineSpeed() {
        return mineSpeed;
    }


    public List<CrewMember> getMembers() {
        return members;
    }


    public void dock(Boolean docked) {
        this.isDocked = docked;
    }


    public boolean getDock() {
        return this.isDocked;
    }


    @Override
    public HashMap<String, Integer> mine() throws InterruptedException, NullPointerException {
        Random random = new Random();
        shipResources.put("iron",0);
        shipResources.put("food",0);
        shipResources.put("gold",0);
        System.out.println(this.name + " Is sent out to Mine resources!");
        for (int i = 0; i < this.mineSpeed; i++) {

            if (random.nextInt(4) == 0) {
                System.out.println("Gathered some food");
                shipResources.put("food", shipResources.get("food") + 1);

            } else if (random.nextInt(3) == 0) {
                System.out.println("Mined some iron!");
                shipResources.put("iron", shipResources.get("iron") + 1);

            } else if (random.nextInt(50) == 0) {
                System.out.println("Mined some gold!");
                shipResources.put("gold", shipResources.get("gold") + 1);

            }
        }
        return this.shipResources;
    }

    @Override
    public void takeDamage() {

    }

    @Override
    public void heal() {

    }


    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", mineSpeed=" + mineSpeed +
                ", members=" + members +
                '}';
    }


}

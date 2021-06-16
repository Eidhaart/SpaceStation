package spacestation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Ship implements Mining {


    private String name;
    private int size = 1;
    private int mineEfficiency = 10;
    private boolean isDocked;
    private int timesSent;

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


    public int getMineEfficiency() {
        return mineEfficiency;
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
    public HashMap<String, Integer> mine() throws NullPointerException {
        Random random = new Random();
        for (int i = 0; i < this.mineEfficiency; i++) {

            if (random.nextInt(4) == 0) {
                if (shipResources.containsKey("food")) {
                    shipResources.put("food", shipResources.get("food") + 1);
                } else {
                    shipResources.put("food", 1);
                }
            } else if (random.nextInt(3) == 0) {
                if (shipResources.containsKey("iron")) {
                    shipResources.put("iron", shipResources.get("iron") + 1);
                } else {
                    shipResources.put("iron", 1);
                }
            } else if (random.nextInt(50) == 0) {
                if (shipResources.containsKey("gold")) {
                    shipResources.put("gold", shipResources.get("gold") + 1);
                } else {
                    shipResources.put("gold", 1);
                }
            }
        }
        if (shipResources.containsKey("gold") || shipResources.containsKey("iron") || shipResources.containsKey("food")) {
            return this.shipResources;

        } else {
            shipResources.put("gold", 0);
            shipResources.put("iron", 0);
            shipResources.put("food", 0);
            return shipResources;
        }

    }

    @Override
    public void takeDamage() {

    }

    @Override
    public void heal() {

    }


    @Override
    public String toString() {
        return "\nSize:" + size +
                "\nMining efficiency:" + mineEfficiency +
                "\nMembers:" + members +
                "\n------------------------\n";
    }


}

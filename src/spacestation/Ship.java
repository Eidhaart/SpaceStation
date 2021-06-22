package spacestation;

import java.io.IOException;
import java.lang.reflect.Member;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Ship {


    private String name;
    private int size;
    private int mineSpeed = 10;
    private boolean isDocked;
    private double miningLevel = 0.25;
    private int timesSent;

    Random random = new Random();
    List<CrewMember> members = new ArrayList<>();
    HashMap<String, Integer> shipResources = new HashMap<>();


    public Ship(String name) throws IOException {
        this.name = name;
        this.size = 1;
        members.add(new CrewMember(Files.readAllLines(Path.of("SpaceStation\\src\\names.txt")).get(random.nextInt(32) + 1)));
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


    public HashMap<String, Integer> mine() throws InterruptedException, NullPointerException {
        Random random = new Random();
        shipResources.put("iron", 0);
        shipResources.put("food", 0);
        shipResources.put("gold", 0);
        for (int i = 0; i < this.mineSpeed; i++) {

            if (random.nextInt(4) == 0) {
                shipResources.put("food", shipResources.get("food") + 1);

            } else if (random.nextInt(3) == 0) {
                shipResources.put("iron", shipResources.get("iron") + 1);

            } else if (random.nextInt(50) == 0) {
                shipResources.put("gold", shipResources.get("gold") + 1);

            }
        }
        return this.shipResources;
    }


    @Override
    public String toString() {
        return " Size=" + size +
                " MineSpeed=" + mineSpeed +
                " Members=" + members +
                '}';
    }


}

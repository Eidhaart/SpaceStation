package spacestation;

import java.util.HashMap;

public class Cargo {

    private int storage;
    HashMap<String, Integer> resources = new HashMap<>();


    public Cargo(int storage) {
        this.storage = storage;
        this.resources.put("Iron", 0);
        this.resources.put("Food", 0);
        this.resources.put("Junk", 0);
        this.resources.put("artifacts", 0);
        this.resources.put("Technology", 0);

    }


}

package spacestation;

import java.util.HashMap;

public class Cargo {

    private int storage;
    HashMap<String, Integer> resources = new HashMap<>();


    public Cargo(int storage) {
        this.storage = storage;

    }

    @Override
    public String toString() {
        return "Cargo" +
                "\nstorage=" + storage +
                "\nresources=" + resources;
    }

    public void addResources(String resource, int quantity){
        this.resources.put(resource.toLowerCase(),quantity);
    }
}

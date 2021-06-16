package spacestation;

import java.util.HashMap;

public class Cargo {

    private int storage;
    HashMap<String, Integer> resources = new HashMap<>();
    HashMap<String, Integer> resourcesDeposited = new HashMap<>();



    public Cargo(int storage) {
        this.storage = storage;
        this.resourcesDeposited.put("iron",0);
        this.resourcesDeposited.put("food",0);
        this.resourcesDeposited.put("gold",0);
        this.resources.put("iron",0);
        this.resources.put("food",0);
        this.resources.put("gold",0);

    }

    @Override
    public String toString() {
        return "Cargo" +
                "\nstorage=" + storage +
                "\nresources=" + resourcesDeposited;
    }

    public void addResources(String resource, int quantity){
        this.resources.put(resource.toLowerCase(),quantity);
    }
}

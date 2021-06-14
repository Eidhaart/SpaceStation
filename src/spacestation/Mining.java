package spacestation;

import java.util.HashMap;

public interface Mining {

    public HashMap<String, Integer> mine() throws InterruptedException;

    public void takeDamage();

    public void heal();
}

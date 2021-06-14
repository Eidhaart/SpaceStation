package spacestation;

import java.util.ArrayList;
import java.util.List;

public class Ship {


    private String name;
    private int size;
    private int mineSpeed;

    List<CrewMember> members = new ArrayList<>();


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

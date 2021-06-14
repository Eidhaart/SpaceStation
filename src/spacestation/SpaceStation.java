package spacestation;

import java.util.ArrayList;
import java.util.List;

public class SpaceStation {

    private String name;
    private int credits;

    List<Ship> ships;
    Cargo cargo;

    public SpaceStation(String name, int credits) {
        this.name = name;
        this.credits = credits;
        this.cargo = new Cargo(200);
        this.ships = new ArrayList<>();
    }


    public void buyShip(){

        if (credits>=100&&ships.size()<5){
            System.out.println("You bought a new Ship!");
            ships.add(new Ship());
            credits-=100;
        }else if (credits==0){
            System.out.println("You don't have enough credits to buy a new Ship!");

        }else if (ships.size()>=5){
            System.out.println("You already have 5 ships!");
        }

    }


    @Override
    public String toString() {
        return "SpaceStation" +
                "\nname='" + name + '\'' +
                "\ncredits=" + credits +
                "\nships=" + ships +
                "\ncargo=" + cargo;
    }
}

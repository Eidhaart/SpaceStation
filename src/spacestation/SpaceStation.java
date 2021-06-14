package spacestation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SpaceStation {

    private String name;
    private int credits;

    HashMap<String, Ship> ships;
    Cargo cargo;
    Scanner scanner = new Scanner(System.in);

    public SpaceStation(String name, int credits) {
        this.name = name;
        this.credits = credits;
        this.cargo = new Cargo(200);
        this.ships = new HashMap<>();
    }

    public boolean creditRequirements() {
        if (this.credits >= 100 && this.ships.size() < 5) {
            credits-=100;
            return true;
        } else {
            System.out.println("You dont have enough credits!");
            return false;
        }
    }

    public void buyShip() {

        if (creditRequirements()) {
            System.out.println("You bought a new Ship!");
            boolean isValid = true;
            String shipName;

            while (isValid){
                System.out.println("Name your ship!");
                 shipName = scanner.nextLine();

                if (!ships.containsKey(shipName)){
                    ships.put(shipName,new Ship(shipName));
                    isValid = false;
                }else {
                    System.out.println("A ship with that name already Exists!");
                    isValid=true;
                }
            }
        }
    }

    public void sendShip(String name) throws InterruptedException {

        ships.get(name).dock(false);
        Thread.sleep(3000);
        System.out.println("Ship returns!");
        cargo.resources = ships.get(name).mine();


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

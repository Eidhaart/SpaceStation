package spacestation;

import java.util.*;
import java.util.stream.Collectors;

public class SpaceStation {

    private String name;
    private int credits;
    private int shipCapacity = 3;

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
            return true;
        } else {
            System.out.println("You dont have enough credits!");
            return false;
        }
    }

    public void buyShip() {

        if (creditRequirements() && ships.size() < shipCapacity) {
            System.out.println("You bought a new Ship!");
            boolean isValid = true;
            String shipName;

            while (isValid) {
                System.out.println("Name your ship!");
                shipName = scanner.nextLine();

                if (!ships.containsKey(shipName)) {
                    ships.put(shipName, new Ship(shipName));
                    credits -= 100;
                    isValid = false;
                } else {
                    System.out.println("A ship with that name already Exists!");
                    isValid = true;
                }
            }
        } else if (ships.size() >= 3) {
            System.out.println("Your station can only hold " + this.shipCapacity + " ships!");
        }
    }

    public void sendShip(String name) throws InterruptedException, NullPointerException {

        ships.get(name).dock(false);
        System.out.println(name + " is sent out to gather resources!");
        Thread.sleep(3000);
        System.out.println("Ship returns!");

        cargo.resources.putAll(ships.get(name).mine());
        System.out.println(ships.get(name).getName() + " Came back with: " + cargo.resources.toString());
        cargo.resourcesDeposited.put("iron", cargo.resources.get("iron") + cargo.resourcesDeposited.get("iron"));
        cargo.resourcesDeposited.put("gold", cargo.resources.get("gold") + cargo.resourcesDeposited.get("gold"));
        cargo.resourcesDeposited.put("food", cargo.resources.get("food") + cargo.resourcesDeposited.get("food"));
    }


    public String shipsToString() {
        return ships.entrySet().stream().map(e -> e.getKey() + ": " + e.getValue()).collect(Collectors.joining(""));
    }


    @Override
    public String toString() {
        return "--------------------------" +
                "\nSPACE STATION" +
                "\nName:'" + name + '\'' +
                "\nCredits:" + credits +
                "\n--------------------------" +
                "\nSHIPS: \n" + shipsToString() +
                "\n--------------------------" +
                "\nCargo: " + cargo +
                "\n--------------------------";
    }
}

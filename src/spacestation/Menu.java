package spacestation;


import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);



    public void menu1() throws InterruptedException, NullPointerException {
        boolean quit = false;
        int choice;

        System.out.println("---Welcome to SPACE STATION!---");
        System.out.println("Enter the name of your Space Station:");
        SpaceStation station = new SpaceStation(scanner.nextLine(), 200);
        System.out.println("Let's start off by buying a ship!");
        System.out.println("A brand new ship will cost you 100 Credits");
        station.buyShip();
        System.out.println("Congratulations! you just bought your first ship!");
        System.out.println("\n" + station.shipsToString());


        while (!quit) {
            System.out.println("Menu:" +
                    "\n1. Buy a new ship" +
                    "\n2. Gather resources" +
                    "\n3. Show Ships" +
                    "\n4. Show Crew members" +
                    "\n5. Upgrade Ship" +
                    "\n6. Train crew members" +
                    "\n7. Sell resources" +
                    "\n8. Show cargo " +
                    "\n9. Quit Game");
            choice = scanner.nextInt();
            Scanner scanner2 = new Scanner(System.in);
            switch (choice) {
                case 1:
                    station.buyShip();
                    break;
                case 2:
                    System.out.println("Which ship would you like to send?");
                    station.sendShip(scanner2.nextLine());
                    break;
                case 3:
                    System.out.println(station.shipsToString());
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println(station.cargo.toString());
                    break;
                case 9:
                    quit = true;
                    break;

            }
        }
    }


}

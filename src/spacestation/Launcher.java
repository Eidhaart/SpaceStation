package spacestation;

import java.util.HashMap;
import java.util.Random;

public class Launcher{

    public static void main(String[] args) throws InterruptedException{

        /*Random random = new Random();

        HashMap<String,Integer> testy = new HashMap<>();
        testy.put("Iron",0);
        testy.put("Gold",0);
        testy.put("Junk",0);
        int choice;




        for (int i = 0; i < 5; i++) {
            choice= random.nextInt(3);
            switch (choice){
                case 0:
                    testy.put("Iron",testy.get("Iron")+1);
                    System.out.println("Mined 1 Iron");

                    break;
                case 1:
                    testy.put("Gold",testy.get("Gold")+1);
                    System.out.println("Mined 1 Gold");

                    break;
                case 2:
                    testy.put("Junk",testy.get("Junk")+1);
                    System.out.println("Mined some Junk...");

                    break;
            }
            Thread.sleep(5000);
        }
        System.out.println(testy.toString());


*/


        SpaceStation station = new SpaceStation("Unconquered",10000);

        station.buyShip();
        station.buyShip();
        station.buyShip();
        station.buyShip();
        station.buyShip();
        station.buyShip();

        System.out.println(station);




    }






}

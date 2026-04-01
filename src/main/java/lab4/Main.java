package lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
   public static void main(String[] args) {
        List<Airplane> garage = new ArrayList<>(Arrays.asList(
                new Airplane("F-16 Fighting Falcon", "Lockheed Martin", 2400, 18000, 7.7),
                new Airplane("AH-225", "Antonov", 800, 12000, 250.0),
                new Airplane("Boeing 747-8F", "Boeing", 920, 13700, 133.0),
                new Airplane("Potushnii Fighting Falcon", "TikTok", 3400, 20000, 6.7),
                new Airplane("Airbus A320", "Airbus S.A.S", 890, 12100, 19.0)
        ));
        System.out.println("------Sorted by Speed");
        garage.sort(Comparator.comparingInt(Airplane::getTopSpeed).reversed());
        printObj(garage);
        System.out.println("------Sorted by Altitude");
        garage.sort(Comparator.comparingInt(Airplane::getMaxAltitude));
        printObj(garage);
    }
    public static void printObj(List<Airplane> items){
        for(Airplane a:items){
            System.out.println(a);
        }
    }
}

package lab4;
import textPackage.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
   public static void main(String[] args) {
        List<Airplane> garage = new ArrayList<>(Arrays.asList(
                new Airplane(new Sentence("F-16 Fighting Falcon"), new Word("Lockheed_Martin"), 2400, 18000, 7.7),
                new Airplane(new Sentence("AH-225"), new Word("Antonov"), 800, 12000, 250.0),
                new Airplane(new Sentence("Boeing 747-8F"), new Word("Boeing"), 920, 13700, 133.0),
                new Airplane(new Sentence("Potushnii Fighting Falcon"), new Word("TikTok"), 3400, 20000, 6.7),
                new Airplane(new Sentence("Airbus A320"), new Word("Airbus_S.A.S"), 890, 12100, 19.0)
        ));
        System.out.println("---Sorted by Manufacturer---");
        garage.sort(Comparator.comparing(Airplane::getManufacturer));
        printObj(garage);
       System.out.println("---Sorted by Model---");
       garage.sort(Comparator.comparing(Airplane::getModel));
       printObj(garage);
    }
    public static void printObj(List<Airplane> items){
        for(Airplane a:items){
            System.out.println(a);
        }
    }
}

package oop;

import org.testng.annotations.Test;

import java.util.Arrays;

public class OOPTest {
    @Test
    public void testMethod() {
        RangeRover aliceSport = new RangeRover("Range Rover", "Sport",
                "negru", 2023,  Arrays.asList("Aer conditionat", "Geamuri electrice", "Oglinzi incalzite"));
        aliceSport.infoRangeRover();
        aliceSport.pornesteMasina();
        aliceSport.promotie();
        System.out.println();

        RangeRover alexSport = new RangeRover("Range Rover", "Sport", "rosu", 2024,
                23450, Arrays.asList("Aer conditionat", "Geamuri electrice"));
        alexSport.infoRangeRover();
        alexSport.promotie(15);
        System.out.println();

        Audi aliceA3 = new Audi("Audi", "A3", "albastru",
                2024, Arrays.asList("Oglinzi incalzite"), Arrays.asList("Dezumidificator", "Improspatare aer"));
        aliceA3.infoAudi();
        aliceA3.pornesteMasina();
        System.out.println();

        Audi alexA3 = new Audi("Audi", "A3", "verde", 2022,
                21230.87, Arrays.asList("Aer conditionat, Scaune incalzite"), Arrays.asList("Improspatare aer"));
        alexA3.infoAudi();
        System.out.println();

        alexA3.setModel("A4");
        alexA3.infoAudi();
    }
}

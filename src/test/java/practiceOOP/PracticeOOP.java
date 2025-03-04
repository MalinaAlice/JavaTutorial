package practiceOOP;

import org.testng.annotations.Test;

public class PracticeOOP {
    @Test
    public void testMethod(){
        PatinajArtistic madgeSyers = new PatinajArtistic("Syers-Cave", "Madge", 25, "Patinaj Artistic", 2);
        madgeSyers.infoPatinajArtistic();
        System.out.println();

        Fotbalist cristianRonaldo = new Fotbalist("Ronaldo", "Cristian", 40, "Fotbalist", "Al-Nassr", "Atacant");
        cristianRonaldo.infoFotbalist();
        System.out.println();
    }
}

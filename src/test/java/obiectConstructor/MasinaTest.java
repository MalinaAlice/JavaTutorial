package obiectConstructor;

import org.testng.annotations.Test;

public class MasinaTest {
    @Test
    public void testMethod() {
        Masina Toyota = new Masina("Toyota", 2019, "Yaris", 22727.81);
        Toyota.detaliiMasina();
        System.out.println();

        Masina Audi = new Masina("Audi", 2009, "A3");
        Audi.detaliiMasina();
        System.out.println();
    }
}

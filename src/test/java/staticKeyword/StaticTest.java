package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {
    @Test
    public void testMethod() {
        Elev alice = new Elev(24, "Alice", "Malina");
        alice.infoElev();
        System.out.println();

        Elev beatrice = new Elev( 23, "Beatrice", "Malina");
        beatrice.infoElev();
        System.out.println();

        System.out.println(Elev.getScoala());
    }
}

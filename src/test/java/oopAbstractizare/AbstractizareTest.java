package oopAbstractizare;

import org.testng.annotations.Test;

public class AbstractizareTest {

    @Test
    public void testMethod() {
        ElevPersoana obiect1 = new ElevPersoana("Popescu", "Ion", 12, "Generala 55", 6);
        obiect1.infoElev();
        System.out.println();

        AngajatPersoana obiect2 = new AngajatPersoana("Malina", "Alice", 24,"Autodesk", "QA", 6500);
        obiect2.infoAngajat();
        System.out.println();


        ElevAngajat obiect3 = new ElevAngajat("Ionescu", "Vlad", 21, "Politehnica", 2, "Alten", "Programator", 8500);
        obiect3.infoElevAngajat();
    }
}

package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //Structuri Repetitive: for, while

    @Test
    public void metodaTest () {

        //afisareNrFor(25);
        //afisareNrForDesc(5);
        //afisareNrPareV1();
        //afisareNrPareV2();
        afisareNrWhile(12);

    }

    //Afisam primele N numere
    public void afisareNrFor (int n) {
        for (int index = 0; index <= n; index ++) {
            System.out.println("Numarul afisat este: " + index);
        }
    }

    //Afisam nr While
    public void afisareNrWhile (int n) {
        int index = 0;
        while(index <= n) {
            System.out.println("Numarul afisat este: " + index);
            index ++;
        }
    }

    public void afisareNrForDesc (int n) {
        for (int index = n; index >= 0; index --) {
            System.out.println("Numarul afisat este: " + index);
        }
    }

    //Afisam nr pare de la 0 la 50
    public void afisareNrPareV1 () {
        for (int i = 0; i <= 50; i= i+2) {
            System.out.println("Numarul par este: " + i);
        }
    }

    //Afisam nr pare de la 0 la 23
    public void afisareNrPareV2 () {
        for (int i = 0; i <= 23; i++) {
            if (i % 2 == 0) {
                System.out.println("Numarul par este: " + i);
            }
        }
    }
}

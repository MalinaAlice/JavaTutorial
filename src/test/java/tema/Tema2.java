package tema;
import org.testng.annotations.Test;

/*Tema2

Rezolvam urmatoarele cerinte:
1. Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
2. Afisam in consola primele 3 numere de la 1 la 3;
3. Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");*/

public class Tema2 {

    @Test
    public void testMethod() {

        afisamCuvDa();
        afisamNr();
        afisamNrMaiMare(15, 20);
        afisamNrMaiMic(3.25, 4.5);
        afisamNrPareNrImpare();
    }

    //Exercitiul 1
    public void afisamCuvDa() {
        String da = "DA";
        for (int index = 0; index <= 4; index++) {
            System.out.println(index + 1 + "\s" + da + "\s" + "meth for"); //adaugam \s pentru a adauga spatiu intre param
        }

        int index = 0;
        while (index <= 4) {
            index++;
            System.out.println(index + "\s" + da + "\s" + "meth while");
        }
    }

    //Exercitiul 2
    public void afisamNr() {
        for (int n = 1; n <= 3; n++) {
            System.out.println("Afisam nr 1-3: " + n);
        }
    }

    //Exercitiul 3
    public void afisamNrMaiMare(int x, int y) {
        if (x > y) {
            System.out.println("Numarul mai mare este x: " + x);
        }
        else {
            System.out.println("Numarul mai mare este y: " + y);
        }
    }

    //Exercitiul 4
    public void afisamNrMaiMic(double a, double b) {
        if (a < b) {
            System.out.println("Numarul mai mic este a: " + a);
        }
        else {
            System.out.println("Numarul mai mic este b: " + b);
        }
    }

    //Exercitiul 5
    public void afisamNrPareNrImpare() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Numerele pare sunt: " + i);
            }
        }
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Numerele IMpare sunt: " + i);
            }
        }
    }
}

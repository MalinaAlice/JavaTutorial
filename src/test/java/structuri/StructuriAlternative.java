package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Exista 2 tipuri de structuri in programare: Alternative si Repetitive
    //Structuri Alternative: if... else..., switch... case...

    @Test
    public void metodaTest() {
        afisamNrMaiMare(100, 89);
        afisamNrMaiMare(56, 120);
        afisamNrMaiMare(24, 24);

        verificamNrDiv5(21);
        verificamNrDiv5(15);

        afisamZileleSaptamanii(5);
        afisamZileleSaptamanii(10);
    }

    //Afisam nr mai mare dintre 2 valori
    public void afisamNrMaiMare(int nr1, int nr2) {
        if (nr1 > nr2) {
            System.out.println("Numarul mai mare este: " + nr1);
        } else if (nr1 == nr2) {
            System.out.println("Numerele sunt egale.");
        } else {
            System.out.println("Numarul mai mare este: " + nr2);
        }
    }

    //Verificam ca un nr este divizibil cu 5
    public void verificamNrDiv5(double nr) {
        if (nr % 5 == 0) {
            System.out.println("Numarul este divizibil cu 5.");
        } else {
            System.out.println("Rezultatul este: " + nr / 5 + ". Nu este divizibil cu 5.");
        }
    }

    //Afisam zilele saptamanii
    public void afisamZileleSaptamanii(int zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este luni.");
                break;
            case 2:
                System.out.println("Astazi este marti.");
                break;
            case 3:
                System.out.println("Astazi este miercuri.");
                break;
            case 4:
                System.out.println("Astazi este joi.");
                break;
            case 5:
                System.out.println("Astazi este vineri.");
                break;
            case 6:
                System.out.println("Astazi este sambata.");
                break;
            case 7:
                System.out.println("Astazi este duminica.");
                break;
            default:
                System.out.println("Valoarea aleasa nu este o zi valida din saptamana.");
        }
    }

}

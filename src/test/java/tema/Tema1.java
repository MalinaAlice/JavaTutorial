package tema;
import org.testng.annotations.Test;

import java.util.Arrays;

/*
Tema 1
Afiseaza pe ecran urmatoarele:
PENTRU FIECARE LINIE SE DECLARA VARIABILE NOI

1. Hello World
2. Varsta ta (numar)
3. Numele si prenumele pe 2 randuri
4. Adauga la "Salut" caracterul "M" la final
5. Adauga la "Hello" caracterul "H" la inceput

6. Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z" *
7. Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!" *

8. Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;
9. Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"
10. Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;
        ! BONUS !
Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3 ?
Rezultatul corect este: {rezultatul}
*/


public class Tema1 {

    @Test
    public void testMethod () {

        tema1();
        afisareIdDepartament(287);
        cautamVocalaSfCuv();
    }

    public void tema1 (){
        String helloWorld = "Hello World";
        String nume = "Malina";
        String nume2 = "Popescu";
        String prenume = "Alice";
        String prenume2 = "Andrei";
        String departamentAngajat = "IT";

        int varsta = 24;
        int salariu = 7000;
        int idAngajat = 678;

        System.out.println(helloWorld);
        System.out.println("Varsta ta este: " + varsta);
        System.out.println(nume + "\n" + prenume); // afisam numele si prenumele pe doua linii diferite
        System.out.println("Salut".concat("M"));
        System.out.println("Salut" + "M");
        System.out.println("H"+ helloWorld);

        if (prenume2 == "Andrei") {
            System.out.println("Salariul lui Andrei este: " + salariu);
        }

        if (nume2 == "Popescu"){
            System.out.println("ID-ul angajatului este: " + idAngajat + " si este in departamentul: " + departamentAngajat);
        }

        float ecuatie = (2+(3*4)-3)/3f;
        System.out.println(ecuatie);
    }

    //Exercitiul 6 semifacut
    public void cautamVocalaSfCuv () {

        String propozitie = "Ana are mere,pere,prune";
        String[] cuvinte = propozitie.split("[,\\s]");
        String vocale = "a,e,i,o,u";
        String[] vocala = vocale.split(",");

        for (String cuvant : cuvinte) {
            //System.out.println(cuvant);
            for (String voc : vocala) {
                //System.out.println(voc);
                if(cuvant.endsWith(voc)) {
                    System.out.println(cuvant.concat("Z"));
                }
            }

        }

    }

    //Exercitiul 10
    public void afisareIdDepartament (int id) {
        if (id > 287) {
            System.out.println("ID-ul departamentului este: " + id);
        }
    }
}

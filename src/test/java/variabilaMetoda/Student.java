package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //clasa= sablon pe baza caruia putem defini un exemplu din viata reala
    //intr-un fisier java recunoastem o clasa dupa cuvantul class
    //este obligatoriu pt o clasa sa aibe nume
    //intr-un fisier java putem avea mai multe clase diferentiate prin numele acestora
    //nu este un best practice in java sa avem mai multe clase intr-un fisier
    //o clasa contine variabile si metode
    //variabila= propr unei clase
    //o variabila poate sau nu sa aibe o valoare
    //o variabila isi poate modifica valoarea
    //valoarea unei variabile se stabileste in functie de tipul de data
    //exista 2 tipuri de variabile: globala si locala
    //o variabila globala se defineste specificand nivelul de vizibilitate(access control)
    //o variabila globala este vizibila peste tot in aceasta clasa
    //o variabila locala se defineste specificand tipul de data si un nume
    //o variabila locala este vizibila doar in locul in care am definit-o
    //metoda = actiunea specifica unei clase
    //intr-o clasa putem avea mai multe metode
    //exista 2 tipuri de metode: void si return
    //recunoastem o metoda dupa access control, tipul metodei, nume, (), {}
    //CTRL+ALT+L aranjeaza codul

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char gen;
    public boolean areRestante;

    @Test
    public void prezentareStudent() {
        nume = "Malina";
        prenume = "Alice";
        varsta = 24;
        adresa = "Bucuresti, Str. Ro nr. 45";
        inaltime = 1.64;
        greutate = 57.2f;
        gen = 'F';
        areRestante = false;

        System.out.println("Prezentarea studentului este: " + nume + ' ' + prenume + ' ' + varsta);
        System.out.println("Adresa studentului este: " + adresa);
        System.out.println("Inaltimea studentului este: " + inaltime);
        System.out.println("Greutatea studentului este: " + greutate);
        System.out.println("Genul studentului este: " + gen);
        System.out.println("Studentul are restante? " + areRestante);

        calculMedie(6, 7);
        calculMedie(8, 9.5);

        calculMedie3(4, 5.5, 8.45);
        calculMedie3(7.5, 6.75, 9.5);
    }

    //Facem o metoda cu variabile locale

    public void calculMedie (double nota1, double nota2) {

        double medie = (nota1 + nota2)/2;

        System.out.println("Media studentului este: " + medie);
    }

    public void calculMedie3 (double nota1, double nota2, double nota3) {

        double medie = (nota1 + nota2 + nota3)/3;

        System.out.println("Media studentului este: " + medie);
    }
}


package obiectConstructor;

public class Student {
    //Constructor = are ca rol sa initializeze variabilele unei clase
    //Intr-o clasa recunoastem un Constructor ca fiind o metoda publica care are exact acelasi nume ca clasa
    //Pentru moment, un Cosntructor este public (poate sa fie si privat - singletone)
    //Intr-o clasa putem avea mai multi constructori diferentiati prin nr sau tipul de parametrii
    //Exista 2 tipuri de Constructori: DEFAULT(este in fiecare clasa fara sa il definim noi) si cu PARAMETRII
    //Daca avem un parametru in Constructor care are acelasi nume cu o variabila din clasa => le initializam folosind THIS
    //Obiect = instanta unei clase
    //Dintr-o clasa putem defini o multime de obiecte
    //Aceste obiecte se diferentiaza prin numele lor
    //In momentul in care se initializeaza un obiect, se apeleaza Constructorul din clasa acestuia
    //Un obiect se initializeaza prin folosirea lui NEW
    //In momentul cand se creeaza un obiect, se aloca un spatiu dedicat in memorie pentru acesta, care are structura clasei

    public String nume;
    public String prenume;
    public int varsta;
    public String facultate;
    public int an;

    public Student(String nume, String prenume, int varsta, String facultate, int an) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.facultate = facultate;
        this.an = an;
    }

    public Student(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void prezentareStudent() {
        System.out.println("Numele studentului este: " + nume);
        System.out.println("Prenumele studentului este: " + prenume);
        System.out.println("Varsta studentului este: " + varsta);

        if(varsta > 35) {
            System.out.println("Studentul nu se mai poate inscrie la facultate.");
        }else if(facultate != null) {
            System.out.println("Facultatea studentului este: " + facultate);
            System.out.println("Anul de facultate al studentului este: " + an);
        }
    }
}

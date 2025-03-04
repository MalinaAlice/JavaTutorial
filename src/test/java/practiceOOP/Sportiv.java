package practiceOOP;

public class Sportiv {

    //Definim mai departe proprietatile unui sportiv in functie de sportul practicat

    private String nume;
    private String prenume;
    private int varsta;
    private String sport;

    public Sportiv(String nume, String prenume, int varsta, String sport) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sport = sport;
    }

    public void infoSportiv() {
        System.out.println("Numele sportivului este: " + nume + ' ' + prenume);
        System.out.println("Varsta sportivului este: " + varsta);
        System.out.println("Sportul practicat este: " + sport);
    }
}

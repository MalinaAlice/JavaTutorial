package staticKeyword;

public class Elev {
    //Static = modalitate prin care setam o valoare pe care sa o accesam in toate instantele clasei
    //Un alt scop este de a accesa o resursa fara sa fie nevoie sa definim un obiect
    //Se pastreaza valoarea proprietatii pentru toate obiectele

    private String nume;
    private String prenume;
    private int varsta;
    private static String scoala = "Poli";

    public Elev(int varsta, String prenume, String nume) {
        this.varsta = varsta;
        this.prenume = prenume;
        this.nume = nume;
    }

    public void infoElev() {
        System.out.println("Numele si prenumele elevului sunt: " + nume + ' ' + prenume);
        System.out.println("Varsta elevului este: " + varsta);
        System.out.println("Scoala elevului este: " + scoala);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public static String getScoala() {
        return scoala;
    }
}

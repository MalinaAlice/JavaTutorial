package oopAbstractizare;

public class Persoana {

    //Abstractizare = conceptul prin care putem defini comportamentul unei clase
    //Abstractizarea se poate face in 2 feluri: folosing INTERFETE sau CLASE ABSTRACTE
    //O INTERFATA contine doar metode abstracte(metode care n-au body)
    //Recunoastem o INTERFATA pe baza cuvantului INTERFACE
    //Toate metodele din interfata sunt publice
    //O interfata nu poate sa contina un constructor => nu putem face un obiect
    //O interfata se IMPLEMENTEAZA
    //O CLASA poate sa implementeze o interfata => Trebuie sa implementeze toate metodele din INTERFATA
    //O CLASA poate implementa mai multe INTERFETE
    //O INTERFATA poate extinde o alta INTERFATA
    //O clasa abstracta poate implementa o interfata, insa interfata nu poate extinde o clasa abstracta


    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana() {
        System.out.println("Numele si prenumele persoanei sunt: " + nume + ' ' + prenume);
        System.out.println("Varsta persoanei este: " + varsta);
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
}

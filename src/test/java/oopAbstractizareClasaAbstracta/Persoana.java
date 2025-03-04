package oopAbstractizareClasaAbstracta;

public abstract class Persoana {
    //O clasa abstracta se recunoaste dupa cuvantul abstract
    //Clasa abstracta poate sau nu sa contina metode abstracte
    //O clasa abstracta se mosteneste
    //Clasa care mosteneste o clasa abstracta trebuie sa implementeze toate metodele abstracte
    //O metoda abstracta trebuie sa contina cuvantul abstract
    //Metodele abstracte pot sa fie publice/protected
    //O clasa abstracta poate sa implementeze o interfata
    //O clasa abstracta poate sa contina un constructor => NU putem face un obiect dintr-o clasa abstracta

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public abstract void mergeLaMunca();

    public abstract void primestiSalariu();

    public abstract void pauzaDeMasa();

    public abstract void mergeInConcediu();

    public abstract void faceCurat();

    public abstract void mergeLaCumparaturi();

    public abstract void mergeLaScoala();

    public abstract void isiFaceTemele();

    public abstract void mergeInPauza();


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

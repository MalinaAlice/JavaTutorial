package oopAbstractizare;

public class ElevAngajat extends Persoana implements Elev,Angajat{

    private String scoala;
    private int clasa;
    private String firma;
    private String ocupatie;
    private double salariu;

    public ElevAngajat(String nume, String prenume, int varsta, String scoala, int clasa, String firma, String ocupatie, double salariu) {
        super(nume, prenume, varsta);
        this.scoala = scoala;
        this.clasa = clasa;
        this.firma = firma;
        this.ocupatie = ocupatie;
        this.salariu = salariu;
    }

    public void infoElevAngajat() {
        infoPersoana();
        System.out.println("Elevul studiaza la scoala " + scoala);
        System.out.println("Elevul este in clasa " + clasa);
        System.out.println("Angajatul lucreaza la firma " + firma);
        System.out.println("Angajatul are ocupatia de " + ocupatie);
        System.out.println("Salariul angajatului este " + salariu);
    }


    public String getScoala() {
        return scoala;
    }

    public void setScoala(String scoala) {
        this.scoala = scoala;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }



    @Override
    public void mergeLaMunca() {

    }

    @Override
    public void primestiSalariu() {

    }

    @Override
    public void pauzaDeMasa() {

    }

    @Override
    public void mergeInConcediu() {

    }

    @Override
    public void mergeLaScoala() {

    }

    @Override
    public void isiFaceTemele() {

    }

    @Override
    public void mergeInPauza() {

    }
}

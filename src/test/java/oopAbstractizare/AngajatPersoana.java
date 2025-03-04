package oopAbstractizare;

public class AngajatPersoana extends Persoana implements Angajat{

    private String firma;
    private String ocupatie;
    private double salariu;

    public AngajatPersoana(String nume, String prenume, int varsta, String firma, String ocupatie, double salariu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.ocupatie = ocupatie;
        this.salariu = salariu;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Angajatul lucreaza la firma " + firma);
        System.out.println("Angajatul are ocupatia de " + ocupatie);
        System.out.println("Salariul angajatului este " + salariu);
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
}

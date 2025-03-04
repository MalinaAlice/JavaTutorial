package oopAbstractizare;

public class ElevPersoana extends Persoana implements Elev{

    private String scoala;
    private int clasa;

    public ElevPersoana(String nume, String prenume, int varsta, String scoala, int clasa) {
        super(nume, prenume, varsta);
        this.scoala = scoala;
        this.clasa = clasa;
    }

    public void infoElev() {
        infoPersoana();
        System.out.println("Elevul studiaza la scoala " + scoala);
        System.out.println("Elevul este in clasa " + clasa);
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


    @Override
    public void mergeLaScoala() {
        System.out.println("Elevul merge la scoala.");
    }

    @Override
    public void isiFaceTemele() {
        System.out.println("Elevul isi face temele.");
    }

    @Override
    public void mergeInPauza() {
        System.out.println("Elevul merge in pauza.");
    }
}

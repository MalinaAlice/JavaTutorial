package practiceOOP;

public class PatinajArtistic extends Sportiv{

    private int numarTrofee;


    public PatinajArtistic(String nume, String prenume, int varsta, String sport, int numarTrofee) {
        super(nume, prenume, varsta, sport);
        this.numarTrofee = numarTrofee;
    }

    public void infoPatinajArtistic(){
        infoSportiv();
        System.out.println("Numarul de trofee castigate sunt: " + numarTrofee);
    }
}

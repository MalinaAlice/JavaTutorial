package practiceOOP;

public class Fotbalist extends Sportiv{
    private String echipa;
    private String pozitieEchipa;

    public Fotbalist(String nume, String prenume, int varsta, String sport, String echipa, String pozitieEchipa) {
        super(nume, prenume, varsta, sport);
        this.echipa = echipa;
        this.pozitieEchipa = pozitieEchipa;
    }

    public void infoFotbalist() {
        infoSportiv();
        System.out.println("Echipa fotbalistului este: " + echipa);
        System.out.println("Pozitia in echipa a fotbalistului este: " + pozitieEchipa);
    }
}

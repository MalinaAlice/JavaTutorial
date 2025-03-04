package tema;

import org.testng.annotations.Test;

public class Prajituri {

    public String nume1;
    public String nume2;
    public boolean dePost1;
    public boolean dePost2;
    public char dulceSarat1;
    public char dulceSarat2;
    public double pret1;
    public double pret2;
    public float calorii1;
    public float calorii2;
    public int bucati1;
    public int bucati2;
    public double total;
    public int totalBucati;
    public float totalCalorii;

    @Test
    public void pachetPrajituri () {

        nume1 = "gogosi";
        dePost1 = false;
        dulceSarat1 = 'D';
        pret1 = 7.5;
        calorii1 = 128.68f;
        bucati1 = 8;

        nume2 = "saratele";
        dePost2 = true;
        dulceSarat2 = 'S';
        pret2 = 1.25;
        calorii2 = 56.12f;
        bucati2 = 25;

        total = bucati1*pret1 + bucati2*pret2;
        totalBucati = bucati1 + bucati2;
        totalCalorii = calorii1*bucati1 + calorii2*bucati2;

        System.out.println("Comanda este: " + nume1 + ',' +  nume2);
        System.out.println("Numarul de bucati este: " + totalBucati);
        System.out.println("Totalul de calorii este de: " + totalCalorii);
        System.out.println("Totalul de plata este de: " + total);

    }
}

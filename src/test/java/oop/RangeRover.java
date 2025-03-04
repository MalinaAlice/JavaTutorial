package oop;

import java.util.List;

public class RangeRover extends Masina {

    private List<String> dotariExterioare;

    public RangeRover(String marca, String model, String culoare, int an, List<String> dotariExterioare) {
        super(marca, model, culoare, an);
        this.dotariExterioare = dotariExterioare;
    }

    public RangeRover(String marca, String model, String culoare, int an, double pret, List<String> dotariExterioare) {
        super(marca, model, culoare, an, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void infoRangeRover() {
        infoMasina();
        System.out.println("Dotariile exterioare sunt: " + dotariExterioare);
    }

    //Polimorfism DINAMIC
    public void pornesteMasina(){
        System.out.println("Mainile Range Rover pornesc prin comanda vocala.");
    }


    //Polimorfism STATIC
    public void promotie() {
        System.out.println("Din pacate nu avem promotii.");
    }

    public void promotie(int discount) {
        System.out.println("Va putem acorda un disccount de " + discount + "%");
    }

    public void promotie(String cupon) {
        System.out.println("Vom aplica urmatorul cupon: " + cupon);
    }


    //Iesire Polimorfism STATIC
    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }
}

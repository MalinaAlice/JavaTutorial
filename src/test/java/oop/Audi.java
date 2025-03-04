package oop;

import java.util.List;

public class Audi extends Masina {
    private List<String> dotariExterioare;
    private List<String> dotariInterioare;

    public Audi(String marca, String model, String culoare, int an, List<String> dotariExterioare, List<String> dotariInterioare) {
        super(marca, model, culoare, an);
        this.dotariExterioare = dotariExterioare;
        this.dotariInterioare = dotariInterioare;
    }

    public Audi(String marca, String model, String culoare, int an, double pret, List<String> dotariExterioare, List<String> dotariInterioare) {
        super(marca, model, culoare, an, pret);
        this.dotariExterioare = dotariExterioare;
        this.dotariInterioare = dotariInterioare;
    }

    public void infoAudi() {
        infoMasina();
        System.out.println("Dotariile exterioare sunt: " + dotariExterioare);
        System.out.println("Dotariile interioare sunt: " + dotariInterioare);
    }

    //Polimorfism DINAMIC
    public void pornesteMasina(){
        System.out.println("Mainile Audi pornesc automat.");
        super.pornesteMasina();
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }
}

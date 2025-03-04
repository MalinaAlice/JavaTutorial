package obiectConstructor;

public class Masina {

    public String marca;
    public int anFabricare;
    public String model;
    public double pret;


    public Masina(String marca, int anFabricare, String model, double pret) {
        this.marca = marca;
        this.anFabricare = anFabricare;
        this.model = model;
        this.pret = pret;
    }

    public Masina(String marca, int anFabricare, String model) {
        this.marca = marca;
        this.anFabricare = anFabricare;
        this.model = model;
    }

    public void detaliiMasina() {

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Anul de fabricare al masinii este: " + anFabricare);
        System.out.println("Modelul masinii este: " + model);

        if(pret == 0) {
            System.out.println("Masina a fost primita de la o ruda.");
        }
    }
}

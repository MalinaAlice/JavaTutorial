package abstractizareRestaurant;

public class RestaurantNonVegan extends Restaurant implements NonVegan{

    public RestaurantNonVegan(String nume, String adresa, String program) {
        super(nume, adresa, program);
    }



    @Override
    public void ingredienteNonVegane() {
        System.out.println("Avem doar ingrediente non-vegane.");
    }

    @Override
    public void tipCarne() {
        System.out.println("Avem pui, oaie, porc, vita.");
    }

    @Override
    public void tipPeste() {
        System.out.println("Avem somon, dorada, pastrav, somn.");
    }
}

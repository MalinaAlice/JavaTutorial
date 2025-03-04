package abstractizareRestaurant;

public class RestaurantVegan extends Restaurant implements Vegan{

    public RestaurantVegan(String nume, String adresa, String program) {
        super(nume, adresa, program);
    }


    @Override
    public void ingredienteVegane() {
        System.out.println("Toate ingredientele sunt vegane.");
    }

    @Override
    public void chelnerVegan() {
        System.out.println("Toti chelnerii respecta normele pentru mancarea vegana.");
    }

    @Override
    public void bucatarVegan() {
        System.out.println("Toti ospatarii respecta normele pentru mancarea vegana.");
    }
}

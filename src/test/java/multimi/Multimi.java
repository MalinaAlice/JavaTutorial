package multimi;
import org.testng.annotations.Test;

import java.util.*;

//tema exemplu3map - carte retete gatit

public class Multimi {
    //Multimi = Array, list, set, map

    @Test
    public void metodaTest () {

//        numeCursantiArray();
//        numeCursantiLista();
//        exemplu1Map();
//        exemplu2Map();
        exemplu3Map();

    }

    //Afisam numele cursantilor de la curs
    public void numeCursantiArray() {
        String[] cursanti = new String[7];
        cursanti[0] = "Alice";
        cursanti[1] = "Andrei";
        cursanti[2] = "Maria";
        cursanti[3] = "Alex";

        int index = 0;
        while(index < cursanti.length) {
            if (index <4) {       //folosim in cazul in care length-ul e mai mare decat cate valori avem si nu vrem sa vedem null
                System.out.println("Numele cursantului utilizand Array este: " + cursanti[index]);
            }
            index++;
        }
    }

    public  void numeCursantiLista() {
        List <String> cursanti = new ArrayList<>();
        cursanti.add("Alice");
        cursanti.add("Maria");
        cursanti.add("Alex");
        cursanti.add("Andrei");
        cursanti.add("Cristian");

        int index = 0;
        while (index < cursanti.size()) {
            System.out.println("Numele cursantului utilizant Lista este: " + cursanti.get(index));
            index++;
        }
    }

    //Definim niste categorii de valori
    public void exemplu1Map() {
        Map<String,String> obiecte = new HashMap<>();
        obiecte.put("Telefon", "Samsung");
        obiecte.put("Masina", "Jeep");
        obiecte.put("Fruct", "Piersica");

        for (String key : obiecte.keySet()) {
            System.out.println("Cheia curenta este: " + key);
            System.out.println("Valoarea pe baza cheii este: " + obiecte.get(key));
        }
    }

    //Afisam orasele impreuna cu tara din care provin
    public void exemplu2Map() {
        Map<String,List<String>> tariOrase = new HashMap<>();
        List<String> oraseRomania = Arrays.asList("Bucuresti", "Iasi", "Brasov");
        List<String> oraseItalia = Arrays.asList("Roma", "Napoli", "Bologna", "Florenta");
        List<String> oraseSpania = Arrays.asList("Madrid", "Barcelona", "Valencia");
        tariOrase.put("Romania", oraseRomania);
        tariOrase.put("Italia", oraseItalia);
        tariOrase.put("Spania", oraseSpania);

        for (String key : tariOrase.keySet()) {
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + tariOrase.get(key));
        }
    }

    //Tema
    public void exemplu3Map() {
        Map<String, List<String>> reteteIngrediente = new HashMap<>();
        List<String> trufeBranza = Arrays.asList("crema de branza", "miere", "cacao");
        List<String> negresa = Arrays.asList("ciocolata neagra", "unt", "cacao", "zahar", "oua", "faina", "sare");
        List<String> clatite = Arrays.asList("faina", "lapte", "oua", "nutella", "sare");
        reteteIngrediente.put("Trufe cu crema de branza", trufeBranza);
        reteteIngrediente.put("Negresa", negresa);
        reteteIngrediente.put("Clatite", clatite);

        for (String key : reteteIngrediente.keySet()) {
            System.out.println(key);
            System.out.println("Ingredientele necesare sunt: " + reteteIngrediente.get(key));
        }

    }
}

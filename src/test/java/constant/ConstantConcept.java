package constant;

import org.testng.annotations.Test;

public class ConstantConcept {
    //Constanta = conceptul prin care definim o proprietate care nu isi mai modifica valoarea initiala

    public final String nume = "Alice";

    @Test
    public void testMethod() {
        System.out.println(nume);

//        nume = "Betty";
        System.out.println(nume);
    }
}

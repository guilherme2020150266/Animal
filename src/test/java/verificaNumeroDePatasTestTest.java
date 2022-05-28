import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;



public class verificaNumeroDePatasTestTest {

    @Test
    public void verificaNumeroDePatasTestTest() {
       Mamifero a = new Mamifero();

       Assertions.assertEquals(Animal.getNumero_de_patas();a.int numero_de_patas());
    }
}
package ejercicio4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class CartaTest {

    /**
     * Test of equals method, of class Carta.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Carta(NumeroCarta.AS, PaloCarta.ESPADAS);

        Carta instance = new Carta(NumeroCarta.AS, PaloCarta.ESPADAS);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

        Carta instance2 = new Carta(NumeroCarta.DOS, PaloCarta.ESPADAS);
        expResult = false;
        result = instance2.equals(obj);
        assertEquals(expResult, result);

        //Simetria
        assertEquals(instance.equals(obj), obj.equals(instance));

        //Nulos
        expResult = false;
        result = instance2.equals(null);
        assertEquals(expResult, result);

        //Reflexividad
        expResult = true;
        result = instance2.equals(instance2);
        assertEquals(expResult, result);

        //Transitividad
        Carta instance3 = new Carta(NumeroCarta.AS, PaloCarta.ESPADAS);
        if (obj.equals(instance) && instance.equals(instance3)) {
            assertEquals(obj.equals(instance3), true);

        }

        //Otra clase
        String s = instance3.toString();
        expResult = false;
        result = instance3.equals(s);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Carta.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Carta instance = new Carta(NumeroCarta.AS, PaloCarta.OROS);
        String expResult = "AS de OROS";
        String result = instance.toString();
        assertEquals(expResult, result);

        Carta instance2 = new Carta(NumeroCarta.CABALLO, PaloCarta.BASTOS);
        expResult = "CABALLO de BASTOS";
        result = instance2.toString();
        assertEquals(expResult, result);
    }

}

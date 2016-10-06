package ejercicio4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class BarajaTest {

    /**
     * Test of getCarta method, of class Baraja.
     */
    @Test
    public void testGetCarta() {
        System.out.println("getCarta");
        int i = 0;
        Baraja instance = new Baraja();
        Carta expResult = new Carta(NumeroCarta.AS, PaloCarta.ESPADAS);
        Carta result = instance.getCarta(i);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetCarta2() {
        int posicion = 0;
        Baraja instance = new Baraja();
        Carta expResult = new Carta(NumeroCarta.AS, PaloCarta.ESPADAS);
        Carta result = instance.getCarta(posicion);
        assertEquals(expResult, result);

        posicion = 12;
        expResult = new Carta(NumeroCarta.TRES, PaloCarta.COPAS);
        result = instance.getCarta(posicion);
        assertEquals(expResult, result);

        posicion = 29;
        expResult = new Carta(NumeroCarta.REY, PaloCarta.BASTOS);
        result = instance.getCarta(posicion);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMazo method, of class Baraja.
     */
    @Test
    public void testGetMazo() {
        System.out.println("getMazo");
        Baraja b = new Baraja();
        Mazo m = b.getMazo();
        Carta c1 = new Carta(NumeroCarta.CUATRO, PaloCarta.BASTOS);
        assertTrue(m.mazo.contains(c1));

    }

}

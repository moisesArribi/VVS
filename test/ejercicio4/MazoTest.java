package ejercicio4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class MazoTest {

    /**
     * Test of introducirCarta method, of class Mazo.
     */
    @Test
    public void testIntroducirCarta_Carta() {
        System.out.println("introducirCarta");
        Carta c = new Carta(NumeroCarta.AS, PaloCarta.OROS);
        Mazo instance = new Mazo();
        instance.insertaCarta(c);
    }

    /**
     * Test of introducirCarta method, of class Mazo.
     */
    @Test
    public void testIntroducirCarta_int_Carta() {
        System.out.println("introducirCarta");
        int posicion = 21;
        Baraja b = new Baraja();
        Mazo m = b.getMazo();
        Carta c1 = m.extraeCarta();
        assertFalse(m.mazo.contains(c1));

        m.insertaCarta(posicion, c1);
        assertEquals(c1.toString(), m.extraeCarta(posicion).toString());

    }

    @Test
    public void testNumCartas() {
        Baraja b = new Baraja();
        Mazo m = b.getMazo();
        int expResult = 40;
        int result = m.numCartas();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertaYExtraeCarta() {
        Mazo instance = new Mazo();
        instance.insertaCarta(new Carta(NumeroCarta.TRES, PaloCarta.OROS));
        instance.insertaCarta(new Carta(NumeroCarta.CINCO, PaloCarta.BASTOS));

        Carta expResult = new Carta(NumeroCarta.CINCO, PaloCarta.BASTOS);
        Carta result = instance.extraeCarta();
        assertEquals(expResult, result);

        expResult = new Carta(NumeroCarta.TRES, PaloCarta.OROS);
        result = instance.extraeCarta();
        assertEquals(expResult, result);

        /* Con indice. */
        instance.insertaCarta(0, new Carta(NumeroCarta.REY, PaloCarta.COPAS));
        instance.insertaCarta(1, new Carta(NumeroCarta.SOTA, PaloCarta.ESPADAS));

        expResult = new Carta(NumeroCarta.SOTA, PaloCarta.ESPADAS);
        result = instance.extraeCarta(1);
        assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void MazoException() {
        Baraja b = new Baraja();
        Mazo m = b.getMazo();
        Carta c = new Carta(NumeroCarta.REY, PaloCarta.OROS);
        m.insertaCarta(m.mazo.size() + 1, c);
    }

    @Test(expected = IllegalArgumentException.class)
    public void MazoException2() {
        Baraja b = new Baraja();
        Mazo m = b.getMazo();
        Carta c = new Carta(NumeroCarta.REY, PaloCarta.BASTOS);
        m.insertaCarta(-4, c);
    }

    @Test(expected = RuntimeException.class)
    public void MazoException3() {
        Baraja b = new Baraja();
        Mazo m = b.getMazo();
        m.mazo.clear();
        m.extraeCarta();
    }

    @Test(expected = RuntimeException.class)
    public void MazoException4() {
        Baraja b = new Baraja();
        Mazo m = b.getMazo();
        m.mazo.clear();
        m.extraeCarta(-1);
    }

    @Test(expected = RuntimeException.class)
    public void MazoException5() {
        Baraja b = new Baraja();
        Mazo m = b.getMazo();
        m.extraeCarta(m.mazo.size());
    }

}

package ejercicio5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class ValoracionTest {

//    /**
//     * Test of values method, of class Valoracion.
//     */
//    @Test
//    public void testValues() {
//        System.out.println("values");
//        Valoracion[] expResult = null;
//        Valoracion[] result = Valoracion.values();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of valueOf method, of class Valoracion.
//     */
//    @Test
//    public void testValueOf() {
//        System.out.println("valueOf");
//        String name = "";
//        Valoracion expResult = null;
//        Valoracion result = Valoracion.valueOf(name);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getValor method, of class Valoracion.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        int expResult = 8;
        int result = Valoracion.EXCELENTE.getValor();
        assertEquals(expResult, result);
    }

    /**
     * Test of esMayor method, of class Valoracion.
     */
    @Test
    public void testEsMayor() {
        System.out.println("esMayor");
        boolean expResult = true;
        boolean result = Valoracion.MEDIOCRE.esMayor(Valoracion.MALA);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsMayor2() {
        System.out.println("esMayor");
        boolean expResult = false;
        boolean result = Valoracion.MEDIOCRE.esMayor(Valoracion.MEDIOCRE);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsMayor3() {
        System.out.println("esMayor");
        boolean expResult = false;
        boolean result = Valoracion.MEDIOCRE.esMayor(Valoracion.BUENA);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsMayor4() {
        System.out.println("esMayor");
        boolean expResult = false;
        boolean result = Valoracion.NO_VALORADA.esMayor(Valoracion.MALA);
        assertEquals(expResult, result);
    }
}

package ejercicio2;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import ejercicio2.*;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class CribaEratostenesTest {
    
    public CribaEratostenesTest() {
    }
    
    /**
     * Test of cribaEratostenes method, of class CribaEratostenes.
     */
    @Test
    public void testCribaEratostenes() {
        System.out.println("Constructor");
        CribaEratostenes cribaTest = new CribaEratostenes(101);
        assertTrue(Arrays.equals(new boolean[]{
            false, false, true , true , false, true , false, true , false, false, /*  0 - 9 */ 
            false, true , false, true , false, false, false, true , false, true , /* 10 - 19 */ 
            false, false, false, true , false, false, false, false, false, true , /* 20 - 29 */ 
            false, true , false, false, false, false, false, true , false, false, /* 30 - 39 */                                     
            false, true , false, true , false, false, false, true , false, false, /* 40 - 49 */ 
            false, false, false, true , false, false, false, false, false, true , /* 50 - 59 */ 
            false, true , false, false, false, false, false, true , false, false, /* 60 - 69 */ 
            false, true , false, true , false, false, false, false, false, true , /* 70 - 79 */ 
            false, false, false, true , false, false, false, false, false, true , /* 80 - 89 */ 
            false, false, false, false, false, false, false, true , false, false, /* 90 - 99 */
            false /* 100 */ }, 
            cribaTest.criba));            
    }

    /**
     * Test of esPrimo method, of class CribaEratostenes.
     */
    @Test
    public void testEsPrimo() {
        System.out.println("esPrimo");
        int n = 0;
        CribaEratostenes instance = new CribaEratostenes(101);
        boolean expResult = false;
        boolean result = instance.esPrimo(n);
        assertEquals(expResult, result);
        result = instance.esPrimo(-5);
        assertEquals(expResult, result);
        result = instance.esPrimo(300);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPrimo2() {
        System.out.println("esPrimo2");
        int n = 17;
        CribaEratostenes instance = new CribaEratostenes(101);
        boolean expResult = true;
        boolean result = instance.esPrimo(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of anteriorPrimo method, of class CribaEratostenes.
     */
    @Test
    public void testAnteriorPrimo() {
        System.out.println("anteriorPrimo");
        int n = 6;
        CribaEratostenes instance = new CribaEratostenes(101);
        int expResult = 5;
        int result = instance.anteriorPrimo(n);
        assertEquals(expResult, result);
        expResult = 7;
        result = instance.anteriorPrimo(10);
        assertEquals(expResult, result);
    }

    /**
     * Test of siguientePrimo method, of class CribaEratostenes.
     */
    @Test
    public void testSiguientePrimo() {
        System.out.println("siguientePrimo");
        int n = 9;
        CribaEratostenes instance = new CribaEratostenes(101);
        int expResult = 11;
        int result = instance.siguientePrimo(n);
        assertEquals(expResult, result);
    }
    
    @Test(expected = RuntimeException.class)
    public void cribaException1() {
        CribaEratostenes instance = new CribaEratostenes(101);
        instance.anteriorPrimo(1);
    }
    
    @Test(expected = RuntimeException.class)
    public void cribaException2() {
        CribaEratostenes instance = new CribaEratostenes(101);
        instance.siguientePrimo(98);
    }
    
}

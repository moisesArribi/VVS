package ejercicio3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class UtilidadesStringTest {

    public UtilidadesStringTest() {
    }

    /**
     * Test of cuentaMayusculas method, of class UtilidadesString.
     */
    @Test
    public void testCuentaMayusculas() {
        System.out.println("cuentaMayusculas");
        String cadena = "HoLa Ke aSe";
        int expResult = 4;
        int result = UtilidadesString.cuentaMayusculas(cadena);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testCuentaMayusculas2() {
        System.out.println("cuentaMayusculas2");
        String cadena = "ahora soy una persona normal";
        int expResult = 0;
        int result = UtilidadesString.cuentaMayusculas(cadena);
        assertEquals(expResult, result);

    }

    /**
     * Test of cuentaMinusculas method, of class UtilidadesString.
     */
    @Test
    public void testCuentaMinusculas() {
        System.out.println("cuentaMinusculas");
        String cadena = "HoLa Ke aSe";
        int expResult = 5;
        int result = UtilidadesString.cuentaMinusculas(cadena);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCuentaMinusculas2() {
        System.out.println("cuentaMinusculas2");
        String cadena = "ahora soy una persona normal";
        int expResult = 24;
        int result = UtilidadesString.cuentaMinusculas(cadena);
        assertEquals(expResult, result);
    }
    
    

    /**
     * Test of cuentaTildes method, of class UtilidadesString.
     */
    @Test
    public void testCuentaTildes() {
        System.out.println("cuentaTildes");
        String cadena = "HoLÁ Ke aSé";
        int[] expResult = new int[]{1,1,0,0,0};
        int[] result = UtilidadesString.cuentaTildes(cadena);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCuentaTildes2() {
        System.out.println("cuentaTildes2");
        String cadena = "áÁá éEeÉeeÉé íÍiiiiiiiíí ÓóooooÓóó u_Ú_ú_U";
        int[] expResult = new int[]{3,4,4,5,2};
        int[] result = UtilidadesString.cuentaTildes(cadena);
        assertArrayEquals(expResult, result);
    }

}

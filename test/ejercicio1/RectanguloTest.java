package ejercicio1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class RectanguloTest {

    public RectanguloTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of setBase method, of class Rectangulo.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        int base = -5;
        Rectangulo instance = new Rectangulo();
        instance.setBase(base);
        int expResult = 5;
        int result = instance.getBase();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAltura method, of class Rectangulo.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        int altura = 6;
        Rectangulo instance = new Rectangulo();
        instance.setAltura(altura);
        int expResult = 6;
        int result = instance.getAltura();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBase method, of class Rectangulo.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Rectangulo instance = new Rectangulo(5, 6);
        int expResult = 5;
        int result = instance.getBase();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAltura method, of class Rectangulo.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Rectangulo instance = new Rectangulo(4, 7);
        int expResult = 7;
        int result = instance.getAltura();
        assertEquals(expResult, result);

    }

    /**
     * Test of esCuadrado method, of class Rectangulo.
     */
    @Test
    public void testEsCuadrado() {
        System.out.println("esCuadrado");
        Rectangulo instance = new Rectangulo(4, 5);
        boolean expResult = false;
        boolean result = instance.esCuadrado();
        assertEquals(expResult, result);

    }

    @Test
    public void testEsCuadrado2() {
        System.out.println("esCuadrado2");
        Rectangulo instance = new Rectangulo(5, 5);
        boolean expResult = true;
        boolean result = instance.esCuadrado();
        assertEquals(expResult, result);

    }

    /**
     * Test of area method, of class Rectangulo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Rectangulo instance = new Rectangulo(5, 3);
        int expResult = 15;
        int result = instance.area();
        assertEquals(expResult, result);
    }

    /**
     * Test of perimetro method, of class Rectangulo.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        Rectangulo instance = new Rectangulo(6, 6);
        int expResult = 24;
        int result = instance.perimetro();
        assertEquals(expResult, result);
    }

    /**
     * Test of gira method, of class Rectangulo.
     */
    @Test
    public void testGira() {
        System.out.println("gira");
        Rectangulo instance = new Rectangulo(5, 10);
        instance.gira();
        int expResultadoBase = 10;
        int expResultadoAltura = 5;
        int resultadoBase = instance.getBase();
        int resultadoAltura = instance.getAltura();
        assertEquals(expResultadoBase, resultadoBase);
        assertEquals(expResultadoAltura, resultadoAltura);
    }

    /**
     * Test of ponHorizontal method, of class Rectangulo.
     */
    @Test
    public void testPonHorizontal() {
        System.out.println("ponHorizontal");
        Rectangulo instance = new Rectangulo(5, 10);
        instance.ponHorizontal();
        int expResultadoBase = 10;
        int expResultadoAltura = 5;
        int resultadoBase = instance.getBase();
        int resultadoAltura = instance.getAltura();
        assertEquals(expResultadoBase, resultadoBase);
        assertEquals(expResultadoAltura, resultadoAltura);
    }

    @Test
    public void testPonHorizontal2() {
        System.out.println("ponHorizontal2");
        Rectangulo instance = new Rectangulo(10, 5);
        instance.ponHorizontal();
        int expResultadoBase = 10;
        int expResultadoAltura = 5;
        int resultadoBase = instance.getBase();
        int resultadoAltura = instance.getAltura();
        assertEquals(expResultadoBase, resultadoBase);
        assertEquals(expResultadoAltura, resultadoAltura);
    }

    /**
     * Test of ponVertical method, of class Rectangulo.
     */
    @Test
    public void testPonVertical() {
        System.out.println("ponVertical");
        Rectangulo instance = new Rectangulo(5, 10);
        instance.ponVertical();
        int expResultadoBase = 5;
        int expResultadoAltura = 10;
        int resultadoBase = instance.getBase();
        int resultadoAltura = instance.getAltura();
        assertEquals(expResultadoBase, resultadoBase);
        assertEquals(expResultadoAltura, resultadoAltura);
    }

    @Test
    public void testPonVertical2() {
        System.out.println("ponVertical2");
        Rectangulo instance = new Rectangulo(10, 5);
        instance.ponVertical();
        int expResultadoBase = 5;
        int expResultadoAltura = 10;
        int resultadoBase = instance.getBase();
        int resultadoAltura = instance.getAltura();
        assertEquals(expResultadoBase, resultadoBase);
        assertEquals(expResultadoAltura, resultadoAltura);
    }

    /**
     * Test of equals method, of class Rectangulo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Rectangulo(5, 10);
        Rectangulo instance = new Rectangulo(10, 5);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    @Test
    public void testEquals2() {
        System.out.println("equals2");
        Object obj = new Rectangulo(6, 10);
        Rectangulo instance = new Rectangulo(10, 5);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    @Test
    public void testEquals3() {
        System.out.println("equals3");
        Object obj = new Rectangulo(5, 10);
        Rectangulo instance = new Rectangulo(5, 5);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    @Test
    public void testEquals4() {
        System.out.println("equals4");
        Object obj = new Rectangulo(5, 10);
        Rectangulo instance = new Rectangulo(5, 10);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    /*Reflexividad*/
    @Test
    public void testEquals5() {
        System.out.println("equals reflexividad");
        Rectangulo instance = new Rectangulo(5, 10);
        boolean expResult = true;
        boolean result = instance.equals(instance);
        assertEquals(expResult, result);

    }
    
    /*Simetria*/
    @Test
    public void testEquals6() {
        System.out.println("equals simetria");
        Object obj = new Rectangulo(5, 10);
        Rectangulo instance = new Rectangulo(5, 10);
        boolean result = obj.equals(instance);
        boolean result2 = instance.equals(obj);
        assertEquals(result2, result);

    }

    /*Transitividad*/
    @Test
    public void testEquals7() {
        System.out.println("equals transitividad");
        Rectangulo instance1 = new Rectangulo(5, 10);
        Rectangulo instance2 = new Rectangulo(5, 10);
        Rectangulo instance3 = new Rectangulo(10, 5);

        boolean result = instance1.equals(instance2);
        boolean result2 = instance2.equals(instance3);
        boolean result3 = instance1.equals(instance3);
        assertEquals(result2, result);
        assertEquals(result, result3);

    }
    
    /*Consistencia*/
    @Test
    public void testEquals8() {
        System.out.println("equals consistencia");
        Rectangulo instance1 = new Rectangulo(5, 10);
        Rectangulo instance2 = new Rectangulo(5, 10);

        boolean result = instance1.equals(instance2);
        boolean result2 = instance1.equals(instance2);
        assertEquals(result2, result);

    }
    
     @Test
    public void testEquals9() {
        System.out.println("equals4");
        String s = "hola";
        Rectangulo instance = new Rectangulo(5, 10);
        boolean expResult = false;
        boolean result = instance.equals(s);
        assertEquals(expResult, result);

    }
    
    /*Nulos*/
    @Test
    public void testEquals10() {
        System.out.println("equals nulos");
        Rectangulo instance1 = new Rectangulo(5, 10);

        boolean result = instance1.equals(null);
        boolean result2 = false;
        assertEquals(result2, result);

    }

    /**
     * Test of hashCode method, of class Rectangulo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Rectangulo instance = new Rectangulo(3, 2);
        int expResult = 52;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rectanguloException1() {
        Rectangulo rectangulo1 = new Rectangulo(0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rectanguloException2() {
        Rectangulo rectangulo2 = new Rectangulo(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rectanguloException3() {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAltura(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rectanguloException4() {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase(0);
    }

}

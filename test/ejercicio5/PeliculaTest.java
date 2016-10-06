package ejercicio5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class PeliculaTest {

    public PeliculaTest() {
    }

    /**
     * Test of insertaValoracion method, of class Pelicula.
     */
    @Test
    public void testInsertaValoracion() {
        System.out.println("insertaValoracion");
        Pelicula instance = new Pelicula("Pulp Fiction");
        instance.insertaValoracion(Valoracion.EXCELENTE);
        instance.insertaValoracion(Valoracion.EXCELENTE);
        instance.insertaValoracion(Valoracion.BUENA);
        instance.insertaValoracion(Valoracion.OBRA_MAESTRA);

        int result = instance.getValoraciones().size();
        int expResult = 4;
        assertEquals(expResult, result);

        String titulo = "Pulp Fiction";
        assertEquals(instance.getTitulo(), titulo);

    }

    /**
     * Test of valoracionMaxima method, of class Pelicula.
     */
    @Test
    public void testValoracionMaxima() {
        System.out.println("valoracionMaxima");
        Pelicula instance = new Pelicula("Reservoir Dogs");
        instance.insertaValoracion(Valoracion.EXCELENTE);
        instance.insertaValoracion(Valoracion.EXCELENTE);
        instance.insertaValoracion(Valoracion.BUENA);
        instance.insertaValoracion(Valoracion.OBRA_MAESTRA);
        instance.insertaValoracion(Valoracion.MALA);
        instance.insertaValoracion(Valoracion.OBRA_MAESTRA);
        instance.insertaValoracion(Valoracion.MEDIOCRE);
        instance.insertaValoracion(Valoracion.NO_VALORADA);
        instance.insertaValoracion(Valoracion.PESIMA);

        Valoracion expResult = Valoracion.OBRA_MAESTRA;
        Valoracion result = instance.valoracionMaxima();
        assertEquals(expResult, result);
    }

    /**
     * Test of valorNumericoMedio method, of class Pelicula.
     */
    @Test
    public void testValorNumericoMedio() throws Exception {
        System.out.println("valorNumericoMedio");
        Pelicula instance = new Pelicula("Who I am");
        instance.insertaValoracion(Valoracion.EXCELENTE);
        instance.insertaValoracion(Valoracion.EXCELENTE);
        instance.insertaValoracion(Valoracion.BUENA);
        instance.insertaValoracion(Valoracion.OBRA_MAESTRA);
        instance.insertaValoracion(Valoracion.MALA);
        instance.insertaValoracion(Valoracion.OBRA_MAESTRA);
        instance.insertaValoracion(Valoracion.MEDIOCRE);
        instance.insertaValoracion(Valoracion.NO_VALORADA);
        instance.insertaValoracion(Valoracion.PESIMA);

        double expResult = 6;
        double result = instance.valorNumericoMedio();
        assertEquals(expResult, result, 0.0);
    }

//    /**
//     * Test of estaValorada method, of class Pelicula.
//     * Como el metodo es privado no lo puedo llamar desde aqui.
//     * 
//     */
//    @Test
//    public void testEstaValorada() {
//        Pelicula instance = new Pelicula("Tesis");
//        instance.insertaValoracion(Valoracion.NO_VALORADA);
//        instance.insertaValoracion(Valoracion.NO_VALORADA);
//        instance.insertaValoracion(Valoracion.NO_VALORADA);
//
//        assertFalse(instance.estaValorada());
//
//        instance.insertaValoracion(Valoracion.EXCELENTE);
//        instance.insertaValoracion(Valoracion.EXCELENTE);
//        instance.insertaValoracion(Valoracion.BUENA);
//        instance.insertaValoracion(Valoracion.OBRA_MAESTRA);
//        instance.insertaValoracion(Valoracion.MALA);
//        instance.insertaValoracion(Valoracion.OBRA_MAESTRA);
//        instance.insertaValoracion(Valoracion.MEDIOCRE);
//        instance.insertaValoracion(Valoracion.NO_VALORADA);
//        instance.insertaValoracion(Valoracion.PESIMA);
//
//        assertTrue(instance.estaValorada());
//    }

    @Test(expected = ValoracionNoValidaException.class)
    public void peliculaException() throws ValoracionNoValidaException {
        System.out.println("Exception valorNumericoMedio");
        Pelicula instance = new Pelicula("Machete");
        instance.valorNumericoMedio();
    }
    
    @Test(expected = ValoracionNoValidaException.class)
    public void peliculaException2() throws ValoracionNoValidaException {
        System.out.println("Exception2 valorNumericoMedio");
        Pelicula instance = new Pelicula("Machete Kills");
        instance.insertaValoracion(Valoracion.NO_VALORADA);
        instance.insertaValoracion(Valoracion.NO_VALORADA);
        instance.insertaValoracion(Valoracion.NO_VALORADA);
        instance.insertaValoracion(Valoracion.NO_VALORADA);
        instance.valorNumericoMedio();
    }

}

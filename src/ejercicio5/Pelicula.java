package ejercicio5;

import static ejercicio5.Valoracion.NO_VALORADA;
import java.util.ArrayList;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class Pelicula {

    /* Atributos.*/
    public String titulo;
    public ArrayList<Valoracion> valoraciones;

    /* Getters y setters (no necesariamente de todos los atributos).*/
    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Valoracion> getValoraciones() {
        return valoraciones;
    }


    /**
     * Inserta una nueva valoracion en la primera posicion vacıa. Se permite
     * insertar NO_VALORADA .
     *
     * @param valoracion valoracion a insertar .
     */
    public void insertaValoracion(Valoracion valoracion) {
        this.valoraciones.add(valoracion);
    }

    /**
     * Comprueba si esta pelicula tiene alguna valoracion.
     *
     * @return true si y solo si existe alguna valoracion que sea distinta de
     * NO_VALORADA ,
     */
    //Falta el private
    private boolean estaValorada() {
        for (int i = 0; i < this.valoraciones.size(); i++) {
            if (this.valoraciones.get(i) != NO_VALORADA) {
                return true;
            }
        }
        return false;
    }

    /**
     * Obtiene la valoracion maxima de esta pelıcula.
     *
     * @return valoracion maxima; o NO_VALORADA si no existen valoraciones.
     */
    public Valoracion valoracionMaxima() {
        Valoracion max = NO_VALORADA;

        for (int i = 0; i < this.valoraciones.size(); i++) {
            if (!max.esMayor(this.valoraciones.get(i))) {
                max = this.valoraciones.get(i);
            }
        }
        return max;
    }

    /**
     * Calcula la valoracion media de esta pelıcula. Los NO_VALORADA no cuentan.
     *
     * @return valor decimal de la valoracion numerica media de esta pelıcula .
     * @exception ValoracionNoValidaException si no existen valoraciones .
     */
    public double valorNumericoMedio() throws ValoracionNoValidaException {
        double total = 0;
        int no_valoradas = 0;

        if (!this.estaValorada()) {
            throw new ValoracionNoValidaException();
        }

        for (int i = 0; i < this.valoraciones.size(); i++) {
            if (this.valoraciones.get(i) != NO_VALORADA) {
                total = total + this.valoraciones.get(i).getValor();
            } else {
                no_valoradas++;
            }
        }

//        if (no_valoradas == this.valoraciones.size()) {
//            throw new ValoracionNoValidaException();
//        }

        return total / (this.valoraciones.size() - no_valoradas);

    }

    /**
     * Inicializa una nueva pelıcula con el tıtulo indicado y las valoraciones
     * como una lista vacıa.
     *
     * @param titulo tıtulo de la pelıcula .
     */
    public Pelicula(String titulo) {
        this.titulo = titulo;
        this.valoraciones = new ArrayList();
    }
}

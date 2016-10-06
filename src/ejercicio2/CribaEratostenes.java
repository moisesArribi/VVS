package ejercicio2;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class CribaEratostenes {

    /*
     * Array de longitud limitada en el que una posicion i es true
     * si y solo si el numero i es primo, y false en caso contrario.
     */
    
    //falta private!!!!!!!!!!!!!!!!!!!!!!!!!!
     final boolean[] criba;

    /**
     * Comprueba si el numero pasado por parametro es primo .
     *
     * @param n numero a comprobar.
     * @return true si y solo si el parametro esta marcado como primo en esta
     * criba.
     */
    public boolean esPrimo(int n) {
        if (n > criba.length || n < 0) {
            return false;
        } else {
            return criba[n];
        }
    }

    /**
     * Obtiene el numero primo mas cercano que sea menor que el numero pasado
     * como referencia. Lanza una excepcion no comprobada si no existe ningun
     * primo.
     *
     * @param n numero a tomar como referencia.
     * @return numero primo mas cercano que sea estrictamente menor que el
     * numero pasado por parametro.
     */
    public int anteriorPrimo(int n) {
        for (int i = (n - 1); i > 0; i--) {
            if (this.criba[i]) {
                return i;
            }
        }
        throw new RuntimeException();
    }

    /**
     * Obtiene el numero primo mas cercano que sea mayor que el numero pasado
     * como referencia. Lanza una excepcion no comprobada si nos hemos salido de
     * los lımites de esta criba .
     *
     * @param n numero a tomar como referencia .
     * @return numero primo mas cercano que sea estrictamente mayor que el
     * numero pasado por parametro.
     */
    public int siguientePrimo(int n) {
        for (int i = (n + 1); i < this.criba.length; i++) {
            if (this.criba[i]) {
                return i;
            }
        }
        throw new RuntimeException();
    }

    /**
     * Inicializa una nueva criba de Eratostenes con el tamano indicado por
     * parametro. Una posicion i es true si y solo si el numero i es primo. El 0
     * y el 1 se consideran no primos.
     *
     * @param tamano tamano de la criba.
     */
    public CribaEratostenes(int tamano) {

        criba = new boolean[tamano];

        criba[0] = false;
        criba[1] = false;

        for (int i = 2; i < tamano; i++) {
            criba[i] = true;
        }

        for (int i = 2; i < tamano; i++) {
            int j = i;
            if (criba[j] == true) {
                while (j + i < tamano) {
                    j = j + i;
                    if (criba[j] == true) {
                        criba[j] = false;
                    }
                }
            }
        }
    }
}

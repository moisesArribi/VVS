package ejercicio3;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class UtilidadesString {

    /**
     * Dado un String, devuelve el numero de caracteres que estan en mayuscula.
     * Tiene en cuenta vocales con tilde y similares caracteres especiales.
     *
     * @param cadena cadena a analizar.
     * @return numero de caracteres que estan en mayuscula.
     */
    public static int cuentaMayusculas(String cadena) {
        int i;
        int contador = 0;
        char c;
        for (i = 0; i < cadena.length(); i++) {
            c = cadena.charAt(i);
            if (isUpperCase(c)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Dada una cadena, devuelve el numero de caracteres que estan en minuscula.
     * Tiene en cuenta vocales con tilde y similares caracteres especiales.
     *
     * @param cadena cadena a analizar.
     * @return numero de caracteres que estan en minuscula.
     */
    public static int cuentaMinusculas(String cadena) {
        int i;
        int contador = 0;
        char c;
        for (i = 0; i < cadena.length(); i++) {
            c = cadena.charAt(i);
            if (isLowerCase(c)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Dado un String, devuelve una lista que cuenta, para cada una de las
     * vocales, cuantas de ellas tienen tilde (ortografıa castellana). Trata por
     * igual mayusculas y minusculas.
     *
     * @param cadena cadena a analizar.
     * @return un array de 5 enteros que indican, respectivamente, el numero de
     * as con tilde, el numero de es con tilde, etc.
     */
    public static int[] cuentaTildes(String cadena) {
        int[] resultado = new int[5];
        int i;
        char c;

        for (i = 0; i < cadena.length(); i++) {
            c = cadena.charAt(i);
            if (c == 'Á' || c == 'á') {
                resultado[0]++;
            }
            if (c == 'É' || c == 'é') {
                resultado[1]++;
            }
            if (c == 'Í' || c == 'í') {
                resultado[2]++;
            }
            if (c == 'Ó' || c == 'ó') {
                resultado[3]++;
            }
            if (c == 'Ú' || c == 'ú') {
                resultado[4]++;
            }
        }
        return resultado;
    }
}

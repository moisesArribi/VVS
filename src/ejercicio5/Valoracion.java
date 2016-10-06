package ejercicio5;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
enum Valoracion {

    NO_VALORADA(0),
    PESIMA(0),
    MALA(2),
    MEDIOCRE(4),
    BUENA(6),
    EXCELENTE(8),
    OBRA_MAESTRA(10);

    private int valor;

    public int getValor() {
        return valor;
    }

    public boolean esMayor(Valoracion nueva) {
        return this.valor > nueva.valor;
    }

    Valoracion(int valor) {
        this.valor = valor;
    }
}

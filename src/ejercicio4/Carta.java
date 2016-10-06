package ejercicio4;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class Carta {

//    public enum PaloCarta {
//
//        OROS, COPAS, ESPADAS, BASTOS
//    }

//    public enum NumeroCarta {
//
//        AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY
//    }
//
    private final PaloCarta palo;
    private final NumeroCarta numero;

    public Carta(NumeroCarta numero, PaloCarta palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.palo != other.palo) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}

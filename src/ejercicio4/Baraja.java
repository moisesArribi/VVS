package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class Baraja {

    public final ArrayList<Carta> baraja;

    public Carta getCarta(int i) {
        return baraja.get(i);
    }

    public Baraja() {
        baraja = new ArrayList<>();
        for (PaloCarta palo : PaloCarta.values()) {
            for (NumeroCarta numero : NumeroCarta.values()) {
                baraja.add(new Carta(numero, palo));
            }
        }
    }

    public Mazo getMazo() {
        Baraja b = new Baraja();
        Mazo m = new Mazo();
        m.mazo = b.baraja;
        Collections.shuffle(m.mazo);
        return m;
    }

}

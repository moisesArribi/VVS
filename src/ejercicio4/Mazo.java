package ejercicio4;

import java.util.ArrayList;
//import java.util.Collections;

/**
 *
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class Mazo {

    public ArrayList<Carta> mazo = new ArrayList<>();

    public Mazo() {
        //this.mazo = b.baraja;
        //Collections.shuffle(mazo);
    }

    public void insertaCarta(Carta c) {
        mazo.add(c);
    }

    public void insertaCarta(int posicion, Carta c) {
        if (posicion < 0 || posicion > mazo.size()) {
            throw new IllegalArgumentException();
        }
        mazo.add(posicion, c);
    }

    public Carta extraeCarta() {
        if (mazo.isEmpty()) {
            throw new RuntimeException();
        }

        Carta c = mazo.get(mazo.size() - 1);
        mazo.remove(mazo.size() - 1);
        return c;
    }

    public Carta extraeCarta(int posicion) {
        if (posicion < 0 || posicion >= mazo.size()) {
            throw new IllegalArgumentException();
        }
        Carta c = mazo.get(posicion);
        mazo.remove(posicion);
        return c;
    }
    
    public int numCartas(){
        return mazo.size();
    }
}

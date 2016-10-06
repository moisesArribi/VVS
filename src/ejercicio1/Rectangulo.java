package ejercicio1;

import static java.lang.Math.abs;

/**
 * @author daniel.pineiro.placer
 * @author moises.arribi
 */
public class Rectangulo {

    /* Atributos con las dimensiones de este rectangulo ( valores enteros ). */
    public int base;
    public int altura;

    /*
     * Setters y getters para los atributos .
     * Si se intenta dar valor 0 a alguna de las dimensiones, lanza
     * la excepcion IllegalArgumentException .
     * Si se intenta dar valor negativo a alguna de las dimensiones ,
     * lo corrige al valor positivo .
     */
    public void setBase(int base) {
        if (base == 0) {
            throw new IllegalArgumentException();
        }
        this.base = abs(base);
    }

    public void setAltura(int altura) {
        if (altura == 0) {
            throw new IllegalArgumentException();
        }
        this.altura = abs(altura);
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    /**
     * Indica si este rectangulo es un cuadrado .
     *
     * @return true si y solo si la base y la altura son iguales .
     */
    public boolean esCuadrado() {
        return this.altura == this.base;
    }

    /**
     * Calcula el area de este rectangulo .
     *
     * @return area de este rectangulo .
     */
    public int area() {
        return base * altura;
    }

    /**
     * Calcula el perımetro de este rectangulo .
     *
     * @return perımetro de este rectangulo.
     */
    public int perimetro() {
        return (2 * base + 2 * altura);
    }

    /**
     * Gira 90 grados este rectangulo .
     */
    public void gira() {
        int aux;
        aux = this.base;
        this.base = this.altura;
        this.altura = aux;
    }

    /**
     * Garantiza que este rectangulo este orientado de forma que la base no sea
     * menor que la altura.
     */
    public void ponHorizontal() {
        if (base < altura) {
            this.gira();
        }
    }

    /**
     * Garantiza que este rectangulo este orientado de forma que la altura no
     * sea menor que la base .
     */
    public void ponVertical() {
        if (base > altura) {
            this.gira();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Rectangulo other = (Rectangulo) obj;
        other.ponHorizontal();
        this.ponHorizontal();

        return (this.altura == other.altura && this.base == other.base);
    }

    @Override
    public int hashCode() {
        int hash = 23;

        hash = this.altura * (hash + this.base);
        return hash;
    }

    /**
     * Inicializa un nuevo rectangulo con los valores pasados por parametro . Si
     * se intenta dar valor 0 a alguna de las dimensiones , lanza la excepcion
     * IllegalArgumentException. Si se intenta dar valor negativo a alguna de
     * las dimensiones , lo corrige al valor positivo .
     *
     * @param base base .
     * @param altura altura .
     */
    public Rectangulo(int base, int altura) {
        if (base == 0) {
            throw new IllegalArgumentException();
        }

        if (altura == 0) {
            throw new IllegalArgumentException();
        }
        this.altura = abs(altura);
        this.base = abs(base);
    }

    /**
     * Inicializa un nuevo rectangulo con base 2 y altura 1.
     */
    public Rectangulo() {
        this.altura = 1;
        this.base = 2;
    }

}

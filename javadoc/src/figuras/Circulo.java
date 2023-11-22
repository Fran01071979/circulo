package figuras;

/**
 * La clase Circulo representa un círculo en un plano bidimensional.
 * Las coordenadas (x, y) representan el centro del círculo, y r representa el radio.
 */
public class Circulo {

    /** Coordenada x del centro del círculo. */
    protected double x;

    /** Coordenada y del centro del círculo. */
    protected double y;

    /** Radio del círculo. */
    protected double r;

    /**
     * Constructor de la clase Circulo.
     * @param x Coordenada x del centro del círculo.
     * @param y Coordenada y del centro del círculo.
     * @param r Radio del círculo.
     */
    public Circulo(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }  

    /**
     * Calcula el área del círculo.
     * @return El área del círculo.
     */
    public double area() {
        return Math.PI * r * r;
    }
}



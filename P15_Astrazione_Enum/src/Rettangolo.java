/**
 * Classe Rettangolo: Implementa interface Forma.
 * 
 * Coerenza: Costruttore + incapsulamento (private da P06).
 * @Override: Fornisce corpo concreto.
 */
public class Rettangolo implements Forma {
    
    private double base;
    private double altezza;
    
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    
    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}
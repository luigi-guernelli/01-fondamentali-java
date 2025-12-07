/**
 * Classe Cerchio: Implementa interface Forma.
 * 
 * Usa Math.PI per precisione (import automatico).
 */
public class Cerchio implements Forma {
    
    private double raggio;
    
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }
    
    @Override
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }
}
/**
 * Tirocinante extends Persona: Override per tirocinante (stipendio=0).
 * 
 * Logica: protected stipendio=0; override enfatizza "senza stipendio".
 */
public class Tirocinante extends Persona {
    
    // Costruttore: Forza stipendio=0
    public Tirocinante(String nome, int eta, double stipendio, String reparto) {
        super(nome, eta, 0.0, reparto);  // Override stipendio a 0
    }
    
    // Override: Comportamento custom
    @Override
    public void presentati() {
        System.out.println("Sono " + getNome() + ", " + eta + " anni, reparto " + reparto + " – Tirocinante senza stipendio.");
    }
    
    // Override toString: Specifico per tirocinante
    @Override
    public String toString() {
        return super.toString() + ", tipo=Tirocinante, stipendio=" + stipendio;  // 0.0
    }
}
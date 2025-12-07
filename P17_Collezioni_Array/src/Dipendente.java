/**
 * Dipendente extends Persona: Override per comportamento specifico.
 * 
 * Logica: Usa protected stipendio da parent (accesso erede).
 * Override presentati() e toString() per dettagli "lavoratore".
 */
public class Dipendente extends Persona {
    
    // Costruttore: Chiama parent super()
    public Dipendente(String nome, int eta, double stipendio, String reparto) {
        super(nome, eta, stipendio, reparto);
    }
    
    // Override: Ridefinisce metodo parent
    @Override
    public void presentati() {
        // Usa protected stipendio (ok da erede)
        System.out.println("Sono " + getNome() + ", " + eta + " anni, reparto " + reparto + " – Dipendente con stipendio " + stipendio + ".");
    }
    
    // Override toString: Aggiunge info specifica
    @Override
    public String toString() {
        return super.toString() + ", tipo=Dipendente, stipendio=" + stipendio;
    }
}
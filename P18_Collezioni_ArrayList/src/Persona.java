/**
 * Classe base Persona: Attributi con modificatori accesso diversi.
 * 
 * Modificatori:
 * - private: Solo dentro classe (es. nome – usa getter).
 * - default (no mod): Solo stesso package (es. eta).
 * - protected: Package + sottoclassi (es. stipendio – eredi accedono).
 * - public: Ovunque (es. reparto).
 * 
 * Metodo base per override.
 */
public class Persona {
    
    // Modificatori di accesso documentati
    private String nome;          // private: Solo questa classe (getter solo)
    int eta;                      // default: Stesso package (no mod esplicito)
    protected double stipendio;   // protected: Package + sottoclassi/eredi
    public String reparto;        // public: Da ovunque
    
    // Costruttore
    public Persona(String nomeInserito, int etaInserita, double stipendioInserito, String repartoInserito) {
        this.nome = nomeInserito;
        this.eta = etaInserita;
        this.stipendio = stipendioInserito;
        this.reparto = repartoInserito;
    }
    
    // Getter per private (da P06)
    public String getNome() {
        return nome;
    }
    
    // Metodo base per override (void, polimorfismo)
    public void presentati() {
        System.out.println("Sono " + nome + ", " + eta + " anni, reparto " + reparto + " – Persona generica.");
    }
    
    // toString base (override Object)
    @Override
    public String toString() {
        return "Persona {nome=" + nome + ", eta=" + eta + ", reparto=" + reparto + "}";
    }
}
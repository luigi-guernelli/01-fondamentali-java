/**
 * Persona estesa per P08: Aggiunge attributo voto con getter/setter.
 * Coerenza: Incapsulamento (private), validazione (voto 0-10).
 */
public class Persona {
    private String nome;
    private int eta;
    private int voto;  // Nuovo: Voto scolastico (0-10)
    
    public Persona(String nomeInserito, int etaInserita, int votoInserito) {
        setNome(nomeInserito);
        setEta(etaInserita);
        setVoto(votoInserito);  // Validazione
    }
    
    // Getter/Setter esistenti da P06 (nome, eta) – omessi per brevità
    public String getNome() { return nome; }
    public void setNome(String n) { nome = n; }  // Semplificato
    public int getEta() { return eta; }
    public void setEta(int e) { if (e > 0) eta = e; }
    
    // Nuovi per voto
    public int getVoto() { return voto; }
    public void setVoto(int nuovoVoto) {
        if (nuovoVoto >= 0 && nuovoVoto <= 10) {
            this.voto = nuovoVoto;
        } else {
            System.out.println("⚠️ Voto non valido (0-10).");
        }
    }
}
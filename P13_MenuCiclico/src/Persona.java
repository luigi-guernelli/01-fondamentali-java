/**
 * Persona base per P11: Attributi con getter (da P06).
 */
public class Persona {
    private String nome;
    private int eta;
    
    public Persona(String nomeInserito, int etaInserita) {
        this.nome = nomeInserito;
        this.eta = etaInserita;
    }
    
    public String getNome() { return nome; }
    public int getEta() { return eta; }
}
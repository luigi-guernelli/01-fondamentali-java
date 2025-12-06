/**
 * Persona estesa per P09: Aggiunge attributo giornoNascita con getter/setter.
 * Coerenza: Incapsulamento (private da P06), validazione (1-7).
 * Nota: Voto omesso qui per focus su switch; riutilizzabile da P08.
 */
public class Persona {
    private String nome;
    private int eta;
    private int giornoSettimana;  // Nuovo: Giorno nascita (1-7)
    
    public Persona(String nomeInserito, int etaInserita, int giornoInserito) {
        setNome(nomeInserito);
        setEta(etaInserita);
        setGiornoNascita(giornoInserito);  // Validazione immediata
    }
    
    // Getter/Setter esistenti da P06 (semplificati per brevità)
    public String getNome() { 
        return nome; 
    }
    public void setNome(String n) { 
        nome = n;  // Semplificato, no validazione qui
    }
    
    public int getEta() { 
        return eta; 
    }
    public void setEta(int e) { 
        if (e > 0) eta = e; 
    }
    
    // Getter per giornoNascita
    public int getGiornoSettimana() { 
        return giornoSettimana; 
    }
    
    // Setter per giornoNascita con validazione
    public void setGiornoNascita(int giornoInserito) {
        if (giornoInserito >= 1 && giornoInserito <= 7) {
            giornoSettimana = giornoInserito;
        } else {
            System.out.println("⚠️ Giorno non valido (1-7).");  // Messaggio corretto
            giornoSettimana = 0;  // Default neutro se invalido
        }
    }
}
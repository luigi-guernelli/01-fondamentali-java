package biblioteca.model;

/**
 * Dipendente: estende Persona, con ruolo extra.
 * Menu speciale per gestione biblioteca.
 */
public class Dipendente extends Persona {
    private String ruolo; // Es. "Bibliotecario"

    public Dipendente(String nome, String cognome, int annoNascita, String ruolo) {
        super(nome, cognome, annoNascita); // Chiama super (da P10)
        this.ruolo = ruolo;
    }

    public String getRuolo() { return ruolo; }

    @Override
    public String toString() {
        return super.toString() + " - Ruolo: " + ruolo; // Usa super (da P11)
    }
}
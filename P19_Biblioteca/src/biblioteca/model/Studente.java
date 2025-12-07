package biblioteca.model;

/**
 * Studente: estende Persona, con matricola.
 * Menu per prestiti personali.
 */
public class Studente extends Persona {
    private String matricola;

    public Studente(String nome, String cognome, int annoNascita, String matricola) {
        super(nome, cognome, annoNascita);
        this.matricola = matricola;
    }

    public String getMatricola() { return matricola; }

    @Override
    public String toString() {
        return super.toString() + " - Matricola: " + matricola;
    }
}
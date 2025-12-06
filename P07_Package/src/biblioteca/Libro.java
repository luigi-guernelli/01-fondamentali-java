/**
 * Classe Libro in package 'libri': Incapsulata con getter/setter.
 * 
 * Coerenza: Struttura simile a Persona (P03-P06), ma per entità diverse.
 */
package biblioteca;

// Definizione della classe
public class Libro {
    // Attributi privati
    private String titolo;
    private String autore;

    // Costruttore
    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    // Metodo per descrivere il libro
    public void descriviLibro() {
        System.out.println("Il libro \"" + titolo + "\" scritto da " + autore + ".");
    }

    // Getter per attributi (per accesso da altri package)
    public String getTitolo() { return titolo; }
    public String getAutore() { return autore; }
}
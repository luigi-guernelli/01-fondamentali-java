package biblioteca.model;

import java.util.Objects; // Per equals/hashCode se serve (da P18)

/**
 * Classe per un libro in biblioteca.
 * Usa enum StatoLibro per disponibilità (da P16).
 */
public class Libro {
    private String titolo;
    private String autore;
    private String isbn;
    private StatoLibro stato; // Enum: DISPONIBILE o PRESTATO

    // Enum inline (da P16)
    public enum StatoLibro {
        DISPONIBILE, PRESTATO
    }

    // Costruttore (da P05)
    public Libro(String titolo, String autore, String isbn) {
        this.titolo = titolo;
        this.autore = autore;
        this.isbn = isbn;
        this.stato = StatoLibro.DISPONIBILE; // Default
    }

    // Getter/Setter (da P06)
    public String getTitolo() { return titolo; }
    public String getAutore() { return autore; }
    public String getIsbn() { return isbn; }
    public StatoLibro getStato() { return stato; }
    public void setStato(StatoLibro stato) { this.stato = stato; }

    // toString (da P07)
    @Override
    public String toString() {
        return "Libro: " + titolo + " di " + autore + " (ISBN: " + isbn + 
               ", Stato: " + stato + ")";
    }

    // Equals per confrontare libri (da P18, opzionale)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }
}
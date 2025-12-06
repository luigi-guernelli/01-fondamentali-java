/**
 * Classe principale per demo package e import.
 * 
 * Obiettivo: 
 * 1. Organizzare classi in package tematici (persone, libri).
 * 2. Importare e usare oggetti cross-package.
 * 3. Riutilizzo OOP: Getter/setter da P06, metodi per output.
 * 
 * Compilazione: javac -d . persone/Persona.java libri/Libro.java Main.java
 * Esecuzione: java Main
 */
// Importo le classi dai package
import persona.Persona;
import biblioteca.Libro;

// Classe principale
public class Main {
    public static void main(String[] args) {
        // Creo l'oggetto persona
        Persona p1 = new Persona("Luigi", 20);

        // Creo l'oggetto libro
        Libro l1 = new Libro("Il Signore degli Anelli", "Tolkien");

        // Uso i metodi
        p1.presentaPersona();
        l1.descriviLibro();
        p1.leggiLibro(l1);  // Interazione coerente tra package
    }
}
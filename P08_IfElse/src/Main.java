/**
 * Progetto P08: Controlli di Flusso - If/Else/If.
 * 
 * Obiettivo: 
 * 1. Eseguire codice basato su condizioni booleane.
 * 2. Struttura: if (condizione) { } else if { } else { }.
 * 3. Concreto: Valuta "voto" di una Persona (integra con P04/P06).
 * 
 * Compilazione: javac Main.java
 * Esecuzione: java Main
 */
public class Main {

    public static void main(String[] args) {
        // Crea Persona con voto (estende P04: usa costruttore)
        Persona studente = new Persona("Luigi", 20, 7);  // Voto = 7 (da 0-10)
        
        // Stampa profilo base
        System.out.println("Profilo Studente: " + studente.getNome() + ", Età: " + studente.getEta());
        
        // Controllo flusso: Valuta voto
        int voto = studente.getVoto();  // Getter da P06
        if (voto >= 9) {
            System.out.println("Eccellente! Complimenti, " + studente.getNome() + "!");
        } else if (voto >= 6) {
            System.out.println("Sufficiente. Bravo, continua così!");
        } else {
            System.out.println("Insufficiente. Studia di più!");
        }
        
        // Demo secondo caso: Cambia voto con setter e rivaluta
        studente.setVoto(5);  // Setter da P06
        System.out.println("\nDopo cambio voto (" + studente.getVoto() + "):");
        if (studente.getVoto() >= 9) {
            System.out.println("Eccellente! Complimenti, " + studente.getNome() + "!");
        } else if (studente.getVoto() >= 6) {
            System.out.println("Sufficiente. Bravo, continua così!");
        } else {
            System.out.println("Insufficiente. Studia di più!");
        }
    }
}
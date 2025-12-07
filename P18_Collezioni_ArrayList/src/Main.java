/**
 * Progetto P18: Collezioni - ArrayList Dinamici.
 * 
 * Obiettivo: 
 * 1. ArrayList<tipo> = new ArrayList<>(); metodi dinamici.
 * 2. add(), remove(), get(indice), contains(), size().
 * 3. Iterazione con for-each o classico (i<size()).
 * 4. Concreto: Lista dinamica di Persona (da P16), modifica e verifica.
 * 
 * Compilazione: javac *.java
 * Esecuzione: java Main
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // 1. Crea ArrayList vuota di Persona
        ArrayList<Persona> persone = new ArrayList<>();
        
        // 2. Aggiungi elementi dinamicamente
        persone.add(new Dipendente("Luigi", 30, 2500.0, "IT"));
        persone.add(new Tirocinante("Anna", 25, 0.0, "Marketing"));
        persone.add(new Dipendente("Mario", 35, 3000.0, "HR"));
        
        // 3. Stampa con for classico (simile array)
        System.out.println("=== ArrayList con For Classico ===");
        for (int i = 0; i < persone.size(); i++) {
            System.out.println("Indice " + i + ": " + persone.get(i));  // toString da P16
        }
        
        // 4. Stampa con for-each
        System.out.println("\n=== ArrayList con For-Each ===");
        for (Persona p : persone) {
            p.presentati();  // Override da P16
        }
        
        // 5. Rimozione e verifica
        System.out.println("\n=== Dopo Rimozione e Verifica ===");
        persone.remove(1);  // Rimuovi indice 1 (Anna)
        System.out.println("Dopo remove(1): " + persone.size() + " elementi");
        
        if (persone.contains(new Dipendente("Luigi", 30, 2500.0, "IT"))) {  // Nota: == non per oggetti, ma equals implicito
            System.out.println("✅ Luigi è presente nella lista");
        }
        
        // Stampa finale con toString
        for (Persona p : persone) {
            System.out.println(p);
        }
    }
}
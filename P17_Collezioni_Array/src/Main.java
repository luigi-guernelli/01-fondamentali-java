/**
 * Progetto P17: Collezioni - Array Fissi.
 * 
 * Obiettivo: 
 * 1. Dichiarare/creare array (new tipo[dimensione]).
 * 2. Assegnare/accesso per indice (0-based).
 * 3. Iterare con for classico (i=0; i<length) o for-each (:).
 * 4. Concreto: Array int + array di Persona (da P16), chiama presentati().
 * 
 * Compilazione: javac *.java
 * Esecuzione: java Main
 */
public class Main {

    public static void main(String[] args) {
        // 1. Array primitivi (int): Dimensione fissa 5
        int[] numeri = new int[5];
        numeri[0] = 10; numeri[1] = 20; numeri[2] = 30; numeri[3] = 40; numeri[4] = 50;
        
        // 2. Array oggetti: Persona[] con 3 elementi (da P16)
        Persona[] persone = new Persona[3];
        persone[0] = new Dipendente("Luigi", 30, 2500.0, "IT");
        persone[1] = new Tirocinante("Anna", 25, 0.0, "Marketing");
        persone[2] = new Dipendente("Mario", 35, 3000.0, "HR");
        
        // 3. Stampa array int con for classico
        System.out.println("=== Array Int con For Classico ===");
        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Indice " + i + ": " + numeri[i]);
        }
        
        // 4. Stampa array Persona con for-each (usa toString da P16)
        System.out.println("\n=== Array Persona con For-Each ===");
        for (Persona p : persone) {
            System.out.println(p);  // Chiama toString() override
            p.presentati();  // Override da P16
            System.out.println();  // Separatore
        }
    }
}
/**
 * Progetto P14: Astrassione Avanzata - Interface.
 * 
 * Obiettivo: 
 * 1. Interface come contratto: Dichiarare metodi senza corpo.
 * 2. Implementazione: Classi concrete (@Override).
 * 3. Polimorfismo: Tratta oggetti diversi come "Forma".
 * 4. Concreto: Calcola area forme geometriche (Rettangolo, Cerchio).
 * 
 * Compilazione: javac *.java
 * Esecuzione: java Main
 */
public class Main {

    public static void main(String[] args) {
        // Polimorfismo: Oggetti diversi, tipo comune "Forma"
        Forma f1 = new Rettangolo(5, 3);  // Base=5, altezza=3
        Forma f2 = new Cerchio(2);        // Raggio=2
        
        // Chiama metodo astratto – implementazione runtime
        System.out.println("Area rettangolo: " + f1.calcolaArea());  // 15.0
        System.out.println("Area cerchio: " + f2.calcolaArea());     // ~12.57
        
        // Demo extra: Terza forma per rinforzo
        Forma f3 = new Rettangolo(4, 6);
        System.out.println("Area secondo rettangolo: " + f3.calcolaArea());  // 24.0
    }
}
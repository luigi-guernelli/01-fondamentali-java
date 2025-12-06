/**
 * Progetto P12: Menu Semplice con Scanner e Switch.
 * 
 * Obiettivo: 
 * 1. Menu testuale + input scelta per switch (da P09).
 * 2. Input multiplo in rami (es. numeri per somma).
 * 3. Concreto: Azioni su Persona (saluta, calcola anno nascita da input).
 * 
 * Compilazione: javac *.java
 * Esecuzione: java Main
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Stampa menu
        System.out.println("===== MENU PRINCIPALE =====");
        System.out.println("1. Saluta Persona");
        System.out.println("2. Calcola anno nascita");
        System.out.println("3. Esci");
        System.out.print("Scegli un'opzione (1-3): ");
        int scelta = scanner.nextInt();

        // Switch per controllo (da P09)
        switch (scelta) {
            case 1:
                System.out.print("Inserisci nome: ");
                String nome = scanner.next();  // next() per parola singola
                System.out.print("Inserisci età: ");
                int eta = scanner.nextInt();
                Persona p1 = new Persona(nome, eta);
                // If da P08 per saluto dinamico
                if (eta >= 18) {
                    System.out.println("Ciao, " + nome + "! Sei maggiorenne.");
                } else {
                    System.out.println("Ciao, " + nome + "! Sei minorenne.");
                }
                break;
            case 2:
                System.out.print("Inserisci anno corrente (es. 2025): ");
                int annoCorrente = scanner.nextInt();
                System.out.print("Inserisci età: ");
                int eta2 = scanner.nextInt();
                int annoNascita = annoCorrente - eta2;  // Da P04
                System.out.println("Anno di nascita: " + annoNascita);
                break;
            case 3:
                System.out.println("Uscita dal programma... Arrivederci!");
                break;
            default:
                System.out.println("Scelta non valida. Riprova.");
        }

        scanner.close();
    }
}